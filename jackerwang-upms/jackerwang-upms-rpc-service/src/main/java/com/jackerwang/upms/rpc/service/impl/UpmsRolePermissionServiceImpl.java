package com.jackerwang.upms.rpc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jackerwang.common.annotation.BaseService;
import com.jackerwang.common.base.BaseServiceImpl;
import com.jackerwang.upms.dao.mapper.UpmsRolePermissionMapper;
import com.jackerwang.upms.dao.model.UpmsRolePermission;
import com.jackerwang.upms.dao.model.UpmsRolePermissionExample;
import com.jackerwang.upms.rpc.api.UpmsRolePermissionService;

/**
 * UpmsRolePermissionService实现 Created by shujackerwang on 2017/3/20.
 */
@Service
@Transactional
@BaseService
public class UpmsRolePermissionServiceImpl extends BaseServiceImpl<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample>
        implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceImpl.class);

    @Autowired
    UpmsRolePermissionMapper upmsRolePermissionMapper;

    @Override
    public int rolePermission(JSONArray datas, int id) {
        List<Integer> deleteIds = new ArrayList<>();
        for (int i = 0; i < datas.size(); i++) {
            JSONObject json = datas.getJSONObject(i);
            if (!json.getBoolean("checked")) {
                deleteIds.add(json.getIntValue("id"));
            } else {
                // 新增权限
                UpmsRolePermission upmsRolePermission = new UpmsRolePermission();
                upmsRolePermission.setRoleId(id);
                upmsRolePermission.setPermissionId(json.getIntValue("id"));
                upmsRolePermissionMapper.insertSelective(upmsRolePermission);
            }
        }
        // 删除权限
        if (deleteIds.size() > 0) {
            UpmsRolePermissionExample upmsRolePermissionExample = new UpmsRolePermissionExample();
            upmsRolePermissionExample.createCriteria().andPermissionIdIn(deleteIds).andRoleIdEqualTo(id);
            upmsRolePermissionMapper.deleteByExample(upmsRolePermissionExample);
        }
        return datas.size();
    }

}
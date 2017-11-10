package com.jackerwang.upms.rpc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jackerwang.common.annotation.BaseService;
import com.jackerwang.common.base.BaseServiceImpl;
import com.jackerwang.upms.dao.mapper.UpmsUserPermissionMapper;
import com.jackerwang.upms.dao.model.UpmsUserPermission;
import com.jackerwang.upms.dao.model.UpmsUserPermissionExample;
import com.jackerwang.upms.rpc.api.UpmsUserPermissionService;

/**
 * UpmsUserPermissionService实现 Created by shujackerwang on 2017/3/20.
 */
@Service
@Transactional
@BaseService
public class UpmsUserPermissionServiceImpl extends BaseServiceImpl<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample>
        implements UpmsUserPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceImpl.class);

    @Autowired
    UpmsUserPermissionMapper upmsUserPermissionMapper;

    @Override
    public int permission(JSONArray datas, int id) {
        for (int i = 0; i < datas.size(); i++) {
            JSONObject json = datas.getJSONObject(i);
            if (json.getBoolean("checked")) {
                // 新增权限
                UpmsUserPermission upmsUserPermission = new UpmsUserPermission();
                upmsUserPermission.setUserId(id);
                upmsUserPermission.setPermissionId(json.getIntValue("id"));
                upmsUserPermission.setType(json.getByte("type"));
                upmsUserPermissionMapper.insertSelective(upmsUserPermission);
            } else {
                // 删除权限
                UpmsUserPermissionExample upmsUserPermissionExample = new UpmsUserPermissionExample();
                upmsUserPermissionExample.createCriteria().andPermissionIdEqualTo(json.getIntValue("id")).andTypeEqualTo(json.getByte("type"));
                upmsUserPermissionMapper.deleteByExample(upmsUserPermissionExample);
            }
        }
        return datas.size();
    }

}
package com.jackerwang.upms.rpc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsPermissionMapper;
import com.jackerwang.upms.dao.model.UpmsPermission;
import com.jackerwang.upms.dao.model.UpmsPermissionExample;

/**
 * 降级实现UpmsPermissionService接口 Created by shujackerwang on 2017/3/20.
 */
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsPermissionServiceMock.class);

    @Override
    public JSONArray getTreeByRoleId(Integer roleId) {
        _log.info("UpmsPermissionServiceMock => getTreeByRoleId");
        return null;
    }

    @Override
    public JSONArray getTreeByUserId(Integer usereId, Byte type) {
        _log.info("UpmsPermissionServiceMock => getTreeByUserId");
        return null;
    }

}

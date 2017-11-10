package com.jackerwang.upms.rpc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsRolePermissionMapper;
import com.jackerwang.upms.dao.model.UpmsRolePermission;
import com.jackerwang.upms.dao.model.UpmsRolePermissionExample;

/**
 * 降级实现UpmsRolePermissionService接口 Created by shujackerwang on 2017/3/20.
 */
public class UpmsRolePermissionServiceMock extends BaseServiceMock<UpmsRolePermissionMapper, UpmsRolePermission, UpmsRolePermissionExample>
        implements UpmsRolePermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsRolePermissionServiceMock.class);

    @Override
    public int rolePermission(JSONArray datas, int id) {
        _log.info("UpmsRolePermissionServiceMock => rolePermission");
        return 0;
    }

}

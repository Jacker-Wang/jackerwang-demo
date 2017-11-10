package com.jackerwang.upms.rpc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsUserRoleMapper;
import com.jackerwang.upms.dao.model.UpmsUserRole;
import com.jackerwang.upms.dao.model.UpmsUserRoleExample;

/**
 * 降级实现UpmsUserRoleService接口 Created by shujackerwang on 2017/11/9.
 */
public class UpmsUserRoleServiceMock extends BaseServiceMock<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {
    private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceMock.class);

    @Override
    public int role(String[] roleIds, int id) {
        _log.info("UpmsUserRoleServiceMock => role");
        return 0;
    }

}

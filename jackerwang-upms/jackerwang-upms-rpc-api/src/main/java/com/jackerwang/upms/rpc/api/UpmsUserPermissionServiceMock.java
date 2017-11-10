package com.jackerwang.upms.rpc.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsUserPermissionMapper;
import com.jackerwang.upms.dao.model.UpmsUserPermission;
import com.jackerwang.upms.dao.model.UpmsUserPermissionExample;

/**
 * 降级实现UpmsUserPermissionService接口 Created by shujackerwang on 2017/3/20.
 */
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample>
        implements UpmsUserPermissionService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserPermissionServiceMock.class);

    @Override
    public int permission(JSONArray datas, int id) {
        _log.info("UpmsUserPermissionServiceMock => permission");
        return 0;
    }

}

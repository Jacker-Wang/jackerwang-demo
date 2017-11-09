package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsUserPermissionMapper;
import com.jackerwang.upms.dao.model.UpmsUserPermission;
import com.jackerwang.upms.dao.model.UpmsUserPermissionExample;

/**
* 降级实现UpmsUserPermissionService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsUserPermissionServiceMock extends BaseServiceMock<UpmsUserPermissionMapper, UpmsUserPermission, UpmsUserPermissionExample> implements UpmsUserPermissionService {

}

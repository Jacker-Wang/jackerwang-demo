package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsPermissionMapper;
import com.jackerwang.upms.dao.model.UpmsPermission;
import com.jackerwang.upms.dao.model.UpmsPermissionExample;

/**
* 降级实现UpmsPermissionService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsPermissionServiceMock extends BaseServiceMock<UpmsPermissionMapper, UpmsPermission, UpmsPermissionExample> implements UpmsPermissionService {

}

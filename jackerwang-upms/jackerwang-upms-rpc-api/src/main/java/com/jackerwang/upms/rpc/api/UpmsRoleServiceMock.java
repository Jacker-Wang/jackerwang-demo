package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsRoleMapper;
import com.jackerwang.upms.dao.model.UpmsRole;
import com.jackerwang.upms.dao.model.UpmsRoleExample;

/**
* 降级实现UpmsRoleService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsRoleServiceMock extends BaseServiceMock<UpmsRoleMapper, UpmsRole, UpmsRoleExample> implements UpmsRoleService {

}

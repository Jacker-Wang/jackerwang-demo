package com.jackerwang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsPermission;
import com.jackerwang.upms.dao.model.UpmsPermissionExample;

/**
 * UpmsPermissionService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsPermissionService extends BaseService<UpmsPermission, UpmsPermissionExample> {
    JSONArray getTreeByRoleId(Integer roleId);

    JSONArray getTreeByUserId(Integer usereId, Byte type);

}
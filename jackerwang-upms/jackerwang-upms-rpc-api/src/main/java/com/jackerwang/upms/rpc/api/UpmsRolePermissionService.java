package com.jackerwang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsRolePermission;
import com.jackerwang.upms.dao.model.UpmsRolePermissionExample;

/**
 * UpmsRolePermissionService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    /**
     * 角色权限
     * 
     * @param datas
     *            权限数据
     * @param id
     *            角色id
     * @return
     */
    int rolePermission(JSONArray datas, int id);
}
package com.jackerwang.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsUserPermission;
import com.jackerwang.upms.dao.model.UpmsUserPermissionExample;

/**
 * UpmsUserPermissionService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsUserPermissionService extends BaseService<UpmsUserPermission, UpmsUserPermissionExample> {
    /**
     * 用户权限
     * 
     * @param datas
     *            权限数据
     * @param id
     *            用户id
     * @return
     */
    int permission(JSONArray datas, int id);

}
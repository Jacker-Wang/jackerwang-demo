package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsUserRole;
import com.jackerwang.upms.dao.model.UpmsUserRoleExample;

/**
 * UpmsUserRoleService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsUserRoleService extends BaseService<UpmsUserRole, UpmsUserRoleExample> {
    /**
     * 用户角色
     * 
     * @param roleIds
     *            角色ids
     * @param id
     *            用户id
     * @return
     */
    int role(String[] roleIds, int id);
}
package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsUserOrganization;
import com.jackerwang.upms.dao.model.UpmsUserOrganizationExample;

/**
 * UpmsUserOrganizationService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsUserOrganizationService extends BaseService<UpmsUserOrganization, UpmsUserOrganizationExample> {
    /**
     * 用户组织
     * 
     * @param organizationIds
     *            组织ids
     * @param id
     *            用户id
     * @return
     */
    int organization(String[] organizationIds, int id);
}
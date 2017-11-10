package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseService;
import com.jackerwang.upms.dao.model.UpmsUser;
import com.jackerwang.upms.dao.model.UpmsUserExample;

/**
 * UpmsUserService接口 Created by shuzheng on 2017/11/9.
 */
public interface UpmsUserService extends BaseService<UpmsUser, UpmsUserExample> {
    UpmsUser createUser(UpmsUser upmsUser);
}
package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsUserMapper;
import com.jackerwang.upms.dao.model.UpmsUser;
import com.jackerwang.upms.dao.model.UpmsUserExample;

/**
 * 降级实现UpmsUserService接口 Created by shujackerwang on 2017/3/20.
 */
public class UpmsUserServiceMock extends BaseServiceMock<UpmsUserMapper, UpmsUser, UpmsUserExample> implements UpmsUserService {

    @Override
    public UpmsUser createUser(UpmsUser upmsUser) {
        return null;
    }

}

package com.jackerwang.upms.rpc.service.impl;

import com.jackerwang.common.annotation.BaseService;
import com.jackerwang.common.base.BaseServiceImpl;
import com.jackerwang.upms.dao.mapper.UpmsUserRoleMapper;
import com.jackerwang.upms.dao.model.UpmsUserRole;
import com.jackerwang.upms.dao.model.UpmsUserRoleExample;
import com.jackerwang.upms.rpc.api.UpmsUserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UpmsUserRoleService实现
* Created by shujackerwang on 2017/11/9.
*/
@Service
@Transactional
@BaseService
public class UpmsUserRoleServiceImpl extends BaseServiceImpl<UpmsUserRoleMapper, UpmsUserRole, UpmsUserRoleExample> implements UpmsUserRoleService {

    private static Logger _log = LoggerFactory.getLogger(UpmsUserRoleServiceImpl.class);

    @Autowired
    UpmsUserRoleMapper upmsUserRoleMapper;

}
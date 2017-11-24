package com.jackerwang.upms.rpc.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jackerwang.common.annotation.BaseService;
import com.jackerwang.common.base.BaseServiceImpl;
import com.jackerwang.upms.dao.mapper.UpmsLogMapper;
import com.jackerwang.upms.dao.model.UpmsLog;
import com.jackerwang.upms.dao.model.UpmsLogExample;
import com.jackerwang.upms.rpc.api.UpmsLogService;

/**
 * UpmsLogService实现 Created by shujackerwang on 2017/11/9.
 */
@Service
@Transactional
@BaseService
public class UpmsLogServiceImpl extends BaseServiceImpl<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

    private static Logger _log = LoggerFactory.getLogger(UpmsLogServiceImpl.class);
    @Autowired
    UpmsLogMapper upmsLogMapper;

}
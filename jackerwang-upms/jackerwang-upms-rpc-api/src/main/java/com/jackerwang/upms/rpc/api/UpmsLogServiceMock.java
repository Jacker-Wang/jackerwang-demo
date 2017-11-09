package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsLogMapper;
import com.jackerwang.upms.dao.model.UpmsLog;
import com.jackerwang.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}

package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsSystemMapper;
import com.jackerwang.upms.dao.model.UpmsSystem;
import com.jackerwang.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}

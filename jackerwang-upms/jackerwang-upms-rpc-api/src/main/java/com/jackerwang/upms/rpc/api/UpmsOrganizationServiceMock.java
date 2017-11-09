package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsOrganizationMapper;
import com.jackerwang.upms.dao.model.UpmsOrganization;
import com.jackerwang.upms.dao.model.UpmsOrganizationExample;

/**
* 降级实现UpmsOrganizationService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}

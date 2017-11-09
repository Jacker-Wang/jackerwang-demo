package com.jackerwang.upms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.upms.dao.mapper.UpmsUserOrganizationMapper;
import com.jackerwang.upms.dao.model.UpmsUserOrganization;
import com.jackerwang.upms.dao.model.UpmsUserOrganizationExample;

/**
* 降级实现UpmsUserOrganizationService接口
* Created by shujackerwang on 2017/11/9.
*/
public class UpmsUserOrganizationServiceMock extends BaseServiceMock<UpmsUserOrganizationMapper, UpmsUserOrganization, UpmsUserOrganizationExample> implements UpmsUserOrganizationService {

}

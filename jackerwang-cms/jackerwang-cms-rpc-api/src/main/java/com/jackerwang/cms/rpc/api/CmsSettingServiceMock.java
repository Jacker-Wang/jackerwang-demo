package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsSettingMapper;
import com.jackerwang.cms.dao.model.CmsSetting;
import com.jackerwang.cms.dao.model.CmsSettingExample;

/**
* 降级实现CmsSettingService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsSettingServiceMock extends BaseServiceMock<CmsSettingMapper, CmsSetting, CmsSettingExample> implements CmsSettingService {

}

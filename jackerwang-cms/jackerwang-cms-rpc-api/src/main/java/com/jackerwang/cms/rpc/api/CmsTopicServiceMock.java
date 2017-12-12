package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsTopicMapper;
import com.jackerwang.cms.dao.model.CmsTopic;
import com.jackerwang.cms.dao.model.CmsTopicExample;

/**
* 降级实现CmsTopicService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsTopicServiceMock extends BaseServiceMock<CmsTopicMapper, CmsTopic, CmsTopicExample> implements CmsTopicService {

}

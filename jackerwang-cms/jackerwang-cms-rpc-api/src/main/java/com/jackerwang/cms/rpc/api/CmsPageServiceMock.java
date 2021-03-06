package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsPageMapper;
import com.jackerwang.cms.dao.model.CmsPage;
import com.jackerwang.cms.dao.model.CmsPageExample;

/**
* 降级实现CmsPageService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsPageServiceMock extends BaseServiceMock<CmsPageMapper, CmsPage, CmsPageExample> implements CmsPageService {

}

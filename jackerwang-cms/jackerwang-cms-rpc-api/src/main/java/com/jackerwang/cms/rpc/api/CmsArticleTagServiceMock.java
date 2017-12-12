package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsArticleTagMapper;
import com.jackerwang.cms.dao.model.CmsArticleTag;
import com.jackerwang.cms.dao.model.CmsArticleTagExample;

/**
* 降级实现CmsArticleTagService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsArticleTagServiceMock extends BaseServiceMock<CmsArticleTagMapper, CmsArticleTag, CmsArticleTagExample> implements CmsArticleTagService {

}

package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsArticleMapper;
import com.jackerwang.cms.dao.model.CmsArticle;
import com.jackerwang.cms.dao.model.CmsArticleExample;

/**
* 降级实现CmsArticleService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsArticleServiceMock extends BaseServiceMock<CmsArticleMapper, CmsArticle, CmsArticleExample> implements CmsArticleService {

}

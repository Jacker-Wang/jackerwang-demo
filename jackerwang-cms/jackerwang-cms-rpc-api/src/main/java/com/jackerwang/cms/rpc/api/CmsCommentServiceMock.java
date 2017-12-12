package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsCommentMapper;
import com.jackerwang.cms.dao.model.CmsComment;
import com.jackerwang.cms.dao.model.CmsCommentExample;

/**
* 降级实现CmsCommentService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsCommentServiceMock extends BaseServiceMock<CmsCommentMapper, CmsComment, CmsCommentExample> implements CmsCommentService {

}

package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsTagMapper;
import com.jackerwang.cms.dao.model.CmsTag;
import com.jackerwang.cms.dao.model.CmsTagExample;

/**
* 降级实现CmsTagService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsTagServiceMock extends BaseServiceMock<CmsTagMapper, CmsTag, CmsTagExample> implements CmsTagService {

}

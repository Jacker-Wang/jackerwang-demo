package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsCategoryMapper;
import com.jackerwang.cms.dao.model.CmsCategory;
import com.jackerwang.cms.dao.model.CmsCategoryExample;

/**
* 降级实现CmsCategoryService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsCategoryServiceMock extends BaseServiceMock<CmsCategoryMapper, CmsCategory, CmsCategoryExample> implements CmsCategoryService {

}

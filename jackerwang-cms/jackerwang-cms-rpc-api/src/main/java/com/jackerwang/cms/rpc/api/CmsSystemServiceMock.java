package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsSystemMapper;
import com.jackerwang.cms.dao.model.CmsSystem;
import com.jackerwang.cms.dao.model.CmsSystemExample;

/**
* 降级实现CmsSystemService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsSystemServiceMock extends BaseServiceMock<CmsSystemMapper, CmsSystem, CmsSystemExample> implements CmsSystemService {

}

package com.jackerwang.cms.rpc.api;

import com.jackerwang.common.base.BaseServiceMock;
import com.jackerwang.cms.dao.mapper.CmsMenuMapper;
import com.jackerwang.cms.dao.model.CmsMenu;
import com.jackerwang.cms.dao.model.CmsMenuExample;

/**
* 降级实现CmsMenuService接口
* Created by shujackerwang on 2017/12/12.
*/
public class CmsMenuServiceMock extends BaseServiceMock<CmsMenuMapper, CmsMenu, CmsMenuExample> implements CmsMenuService {

}

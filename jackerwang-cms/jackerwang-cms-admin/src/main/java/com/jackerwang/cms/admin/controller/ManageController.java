package com.jackerwang.cms.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jackerwang.common.base.BaseController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 后台controller Created by ZhangShujackerwang on 2017/01/12.
 */
@Controller
@RequestMapping("/manage")
@Api(value = "后台控制器", description = "后台管理")
public class ManageController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManageController.class);

    /**
     * 后台首页
     * 
     * @return
     */
    @ApiOperation(value = "后台首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("manage.index");
        return "/manage/index.jsp";
    }

}
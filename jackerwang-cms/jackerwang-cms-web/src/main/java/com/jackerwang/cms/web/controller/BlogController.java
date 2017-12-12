package com.jackerwang.cms.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jackerwang.cms.dao.model.CmsArticle;
import com.jackerwang.cms.dao.model.CmsArticleExample;
import com.jackerwang.cms.dao.model.CmsCategory;
import com.jackerwang.cms.dao.model.CmsCategoryExample;
import com.jackerwang.cms.dao.model.CmsSystem;
import com.jackerwang.cms.dao.model.CmsSystemExample;
import com.jackerwang.cms.dao.model.CmsTag;
import com.jackerwang.cms.dao.model.CmsTagExample;
import com.jackerwang.cms.rpc.api.CmsArticleService;
import com.jackerwang.cms.rpc.api.CmsCategoryService;
import com.jackerwang.cms.rpc.api.CmsCommentService;
import com.jackerwang.cms.rpc.api.CmsSystemService;
import com.jackerwang.cms.rpc.api.CmsTagService;
import com.jackerwang.common.base.BaseController;
import com.jackerwang.common.util.Paginator;

/**
 * 博客首页控制器 Created by shuzheng on 2017/3/26.
 */
@Controller
@RequestMapping(value = "/blog")
public class BlogController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogController.class);
    private static String CODE = "blog";
    private static Integer USERID = 1;

    @Autowired
    private CmsArticleService cmsArticleService;

    @Autowired
    private CmsCategoryService cmsCategoryService;

    @Autowired
    private CmsTagService cmsTagService;

    @Autowired
    private CmsSystemService cmsSystemService;

    @Autowired
    private CmsCommentService cmsCommentService;

    /**
     * 首页
     * 
     * @param page
     * @param sort
     * @param order
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(@RequestParam(required = false, defaultValue = "1", value = "page") int page,
            @RequestParam(required = false, defaultValue = "orders", value = "sort") String sort,
            @RequestParam(required = false, defaultValue = "desc", value = "order") String order, HttpServletRequest request, Model model) {
        // 系统id
        CmsSystemExample cmsSystemExample = new CmsSystemExample();
        cmsSystemExample.createCriteria().andCodeEqualTo(CODE);
        CmsSystem system = cmsSystemService.selectFirstByExample(cmsSystemExample);
        model.addAttribute("system", system);
        // 该系统类目
        CmsCategoryExample cmsCategoryExample = new CmsCategoryExample();
        cmsCategoryExample.createCriteria().andSystemIdEqualTo(system.getSystemId());
        cmsCategoryExample.setOrderByClause("orders asc");
        List<CmsCategory> categories = cmsCategoryService.selectByExample(cmsCategoryExample);
        model.addAttribute("categories", categories);
        // 该系统标签
        CmsTagExample cmsTagExample = new CmsTagExample();
        cmsTagExample.createCriteria().andSystemIdEqualTo(system.getSystemId());
        cmsTagExample.setOrderByClause("orders asc");
        List<CmsTag> tags = cmsTagService.selectByExample(cmsTagExample);
        model.addAttribute("tags", tags);
        // 该系统文章列表
        int rows = 10;
        CmsArticleExample cmsArticleExample = new CmsArticleExample();
        cmsArticleExample.createCriteria().andStatusEqualTo((byte) 1).andSystemIdEqualTo(system.getSystemId());
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            cmsArticleExample.setOrderByClause(sort + " " + order);
        }
        List<CmsArticle> articles = cmsArticleService.selectByExampleForOffsetPage(cmsArticleExample, (page - 1) * rows, rows);
        model.addAttribute("articles", articles);
        // 文章总数
        long total = cmsArticleService.countByExample(cmsArticleExample);
        // 分页
        Paginator paginator = new Paginator(total, page, rows, request);
        model.addAttribute("paginator", paginator);
        return thymeleaf("/blog/index");
    }

}
package com.jackerwang.cms.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jackerwang.cms.dao.model.CmsTopic;
import com.jackerwang.cms.dao.model.CmsTopicExample;
import com.jackerwang.cms.rpc.api.CmsTopicService;
import com.jackerwang.common.base.BaseController;
import com.jackerwang.common.util.Paginator;

/**
 * 专题首页控制器 Created by shuzheng on 2017/3/26.
 */
@Controller
@RequestMapping(value = "/topic")
public class TopicController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TopicController.class);

    @Autowired
    private CmsTopicService cmsTopicService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list(@RequestParam(required = false, defaultValue = "1", value = "page") int page, HttpServletRequest request, Model model) {
        // 专题列表
        int rows = 10;
        CmsTopicExample cmsTopicExample = new CmsTopicExample();
        List<CmsTopic> topics = cmsTopicService.selectByExampleForOffsetPage(cmsTopicExample, (page - 1) * rows, rows);
        model.addAttribute("topics", topics);
        // 文章总数
        long total = cmsTopicService.countByExample(cmsTopicExample);
        // 分页
        Paginator paginator = new Paginator(total, page, rows, request);
        model.addAttribute("paginator", paginator);
        return thymeleaf("/topic/list");
    }
}
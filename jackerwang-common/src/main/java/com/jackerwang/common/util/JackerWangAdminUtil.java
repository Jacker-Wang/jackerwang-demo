package com.jackerwang.common.util;

import javax.servlet.ServletContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

/**
 * 启动解压jackerwangAdmin-x.x.x.jar到resources目录 Created by shujackerwang on
 * 2016/12/18.
 */
public class JackerWangAdminUtil implements InitializingBean, ServletContextAware {

    private static Logger _log = LoggerFactory.getLogger(JackerWangAdminUtil.class);

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        _log.info("===== 开始解压jackerwang-admin =====");
        String version = PropertiesFileUtil.getInstance("jackerwang-admin-client").get("jackerwang.admin.version");
        _log.info("jackerwang-admin.jar 版本: {}", version);
        String jarPath = servletContext.getRealPath("/WEB-INF/lib/jackerwang-admin-" + version + ".jar");
        _log.info("jackerwang-admin.jar 包路径: {}", jarPath);
        String resources = servletContext.getRealPath("/") + "/resources/jackerwang-admin";
        _log.info("jackerwang-admin.jar 解压到: {}", resources);
        JarUtil.decompress(jarPath, resources);
        _log.info("===== 解压jackerwang-admin完成 =====");
    }

}

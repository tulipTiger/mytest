package com.tulip.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Copyright (C), 2019, 郁丿
 * FileName:     MyServletContextListener
 * Description:  自定义 ServletContext  进行监听
 *
 * @author: root
 * @time: 2019/11/24 12:18
 */

public class MyServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("当 ServletContext 进行 初始化 时 调用 ! ");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("当前 ServletContext 被 销毁时执行! ");
    }
}

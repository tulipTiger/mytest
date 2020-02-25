package com.tulip.web.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Copyright (C), 2019, 郁丿
 * FileName:     MySessionContextListener
 * Description:  进行 session 的生命 周期 监听
 *
 * @version v1.0
 * @author: root
 * @time: 2019/11/24 12:29
 */
public class MySessionContextListener implements HttpSessionListener {
    // 测试值
    private static int number = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("session 被创建");
        // 当 session  被 创建时 调用
        number++;
        System.out.println(number);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        // 当 session 生命周期 结束时 执行
        System.out.println(" session 被 销毁");

    }
}

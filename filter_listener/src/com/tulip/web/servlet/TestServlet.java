package com.tulip.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright (C), 2019, 郁丿
 * FileName:     TestServlet
 * Description:  进行 测试 Servlet
 *
 * @version v1.0
 * @author: root
 * @time: 2019/11/23 8:49
 */
// @WebServlet("/testServlet")
@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("test Servlet");
        // 进行 请求 转发
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
     }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}

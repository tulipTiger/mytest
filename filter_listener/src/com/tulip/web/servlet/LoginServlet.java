package com.tulip.web.servlet;

import com.tulip.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Copyright (C), 2019, 郁丿
 * FileName:     LoginServlet
 * Description:  Login 登录 处理 Servlet
 *
 * @version 1.0
 * @author: root
 * @time: 2019/11/23 21:04
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 获取 验证码
        String codeReq = req.getParameter("checkCode");
        System.out.println(codeReq);
        // 进行 请求参数验证码 与 服务端验证码 进行  比较
        HttpSession session = req.getSession();
        // 获取 Session 中的验证码
        String codeServer = (String) session.getAttribute("CHECKCODE_SERVER");
        System.out.println(codeServer);
        // 进行比较
        if (!codeServer.toUpperCase().equals(codeReq.toUpperCase())) {
            // 请求 转发到 登录页面
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }

        // 获取请求参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        // 模拟 数据库数据 username="tulip" password="199912"
        if ("tulip".equals(username) && "199912".equals(password)) {
            session.setAttribute("user", new User(1, username, password));
            // 请求 转发到 登录成功 页面
            req.getRequestDispatcher("/WEB-INF/jsp/userInfo.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }

}

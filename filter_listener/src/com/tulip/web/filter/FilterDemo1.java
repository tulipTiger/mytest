package com.tulip.web.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * Copyright (C), 2019, 郁丿
 * FileName:     FilterDemo1
 * Description:   filter 入门 案例
 * Filter 是一个 接口, 需要 自定义 Filter 则需要 一个雷 实现 Filter 接口 重写 方法 即可.
 *
 * @version v1.0
 * @author: root
 * @time: 2019/11/23 8:09
 */

public class FilterDemo1 implements Filter {
    /**
     * 功能描述: <br>
     * 〈 用于 Filter 过滤器的 初始化 设置 ,只调用 一次〉
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("对 filterDemo1 进行初始化");
    }

    /**
     * 功能描述: <br>
     * 〈 当请求 资源 被 拦截器 拦截时 执行, 每进行 一次 拦截 则 执行一次〉
     *
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 请求 所 访问 资源 前执行
        System.out.println("FilterDemo1 过滤器被执行");

        // 放行, 不进行 放行 那么 请求所访问的 servlet  便不会被 执行
        chain.doFilter(request,response);

        // 放行后的 代码 是否 会执行 , 什么时候执行 ?
        // 会在 执行完 请求 所访问的 资源 后 , 在来 执行 放行后的 代码
        System.out.println(" FilterDemo1 放行 后的 代码执行 ");
    }


    /**
     * 功能描述: <br>
     * 〈 用于 Filter 对象 被销毁时 调用, 只调用一次 〉
     *  即 服务器 正常 关闭 时 会调用 destroy()
     */
    @Override
    public void destroy() {
        System.out.println("filterDemo1 对象 被销毁时 执行");
    }
}

package com.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends HttpServlet {
    public LifeCycle() {
        System.out.println("正在创建life cycle");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("正在初始化life cycle");
    }

    @Override
    public void destroy() {
        System.out.println("正在销毁life cycle");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<span style='color:red'>hi，，," + name + "!</span><hr/>";
        System.out.println("返回给浏览器的响应为:" + html);
        PrintWriter out = resp.getWriter();
        out.println(html);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}

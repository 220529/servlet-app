package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Hi extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String html = "<span style='color:red'>hi," + name + "!</span><hr/>";
        System.out.println("返回给浏览器的响应为:" + html);
        PrintWriter out = resp.getWriter();
        out.println(html);
    }
}

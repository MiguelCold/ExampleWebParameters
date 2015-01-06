/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.udea.examplewebparameters.domain.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    private String dbName = "";
    private String dbPassword = "";

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext context = getServletContext();
        dbName = context.getInitParameter("name");
        dbPassword = context.getInitParameter("password");

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        ServletOutputStream out = res.getOutputStream();
        res.setContentType("text/html");
        out.println("<html><head><title>Basic Servlet</title></head>");
        out.println("<body>Database username is  <b>" + dbName);
        out.println("</b><br>Database password is  <b>" + dbPassword + "</b>");
        out.println("</body></html>");
    }
}

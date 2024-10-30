package org.example;


import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        System.out.println("in service");
        res.setContentType("text/html");

        PrintWriter out  = res.getWriter();
        out.println("<h2><b>Hello World</b></h2>");
    }
}

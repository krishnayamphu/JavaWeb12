package com.ky.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CookieGetServlet", value = "/cookie-get")
public class CookieGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies=request.getCookies();

        for (Cookie c:cookies  ) {
            response.getWriter().print(c.getName()+"=>"+c.getValue());
        }
    }
}

package com.ky.servlets.media;

import com.ky.utils.MediaFile;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MediaDelController", value = "/media-del")
public class MediaDelController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path=getServletContext().getRealPath("/uploads");
        String item=request.getParameter("pic");
        MediaFile.remove(path,item);
        response.sendRedirect("media");
    }
}

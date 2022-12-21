package com.ky.listeners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("request destroy");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("request send");
    }
}

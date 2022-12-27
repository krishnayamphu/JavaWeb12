package com.ky.listeners;

import com.ky.databases.Database;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Database.run();
        System.out.println("web apps deployed successfully.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        Database.destroy();
        System.out.println("web apps undeployed successfully.");
    }
}

package com.ky.databases;

public class Database {
    public static void run(){
        UserTable.create();
    }

    public static void destroy(){
        UserTable.drop();
    }
}

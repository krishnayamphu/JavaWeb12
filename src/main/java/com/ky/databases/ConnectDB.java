package com.ky.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
    static String url = "jdbc:mysql://localhost:3306";
    static String user = "root";
    static String password = "";
    static String dbname = "java12";

    public static Connection connect() {
        Connection cn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url + "/" + dbname, user, password);
            System.out.println("server connected");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }
}

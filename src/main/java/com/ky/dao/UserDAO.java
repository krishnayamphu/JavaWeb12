package com.ky.dao;

import com.ky.databases.ConnectDB;
import com.ky.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    public static void create(User user){
        try {
            Connection cn= ConnectDB.connect();
            String sql="INSERT INTO users (username, password) VALUES (?, ?)";
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2,user.getPassword());
            ps.executeUpdate();
            System.out.println("Data Inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

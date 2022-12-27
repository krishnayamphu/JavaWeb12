package com.ky.jdbc;

import com.ky.dao.UserDAO;
import com.ky.models.User;

import java.sql.*;

public class JdbcTest {
    String url = "jdbc:mysql://localhost:3306";
    String user = "root";
    String password = "";
    String dbname = "java12";

    public void insertData(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url + "/" + dbname, user, password);
            System.out.println("server connected");
            String sql = "insert into todo (items) values(?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "write a song");
            ps.executeUpdate();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void deleteData(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url + "/" + dbname, user, password);
            System.out.println("server connected");
            String sql = "delete from todo where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, 5);
            ps.executeUpdate();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void updateData(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url + "/" + dbname, user, password);
            System.out.println("server connected");
            String sql = "update todo set items=? where id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Visit doctor");
            ps.setInt(2,4);
            ps.executeUpdate();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        JdbcTest obj=new JdbcTest();

        UserDAO.create(new User("user","u123"));

    }
}

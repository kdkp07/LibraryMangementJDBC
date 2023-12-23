package com.library.resources;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection conn;
    public static Connection createConnection(){
        try{
            //Load the class
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_manage","root","Kuldeep@123");

        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}

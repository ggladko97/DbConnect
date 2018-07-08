package com.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    //use ALT+SHIFT +L to auto-format  in intellij idea
    public static void main(String[] args) throws SQLException {
        Connection connection;

        //use private static final for constants. move just  bellow class declaration
           String url = "jdbc:mysql://localhost:3306/blink";
           String user = "root";
           String password = "password";



        Driver driver = new FabricMySQLDriver();
        DriverManager.registerDriver(driver);
        connection = DriverManager.getConnection(url, user, password);
    }
}

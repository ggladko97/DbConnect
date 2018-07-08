package com.database;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] ar) throws SQLException {
        Connection connection;

           String url = "jdbc:mysql://localhost:3306/blink";
           String user = "root";
           String password = "password";



        Driver driver = new FabricMySQLDriver();
        DriverManager.registerDriver(driver);
        connection = DriverManager.getConnection(url, user, password);
    }
}

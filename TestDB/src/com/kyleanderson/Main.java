package com.kyleanderson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        try {
            // For windows
//            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/testjava.db");

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

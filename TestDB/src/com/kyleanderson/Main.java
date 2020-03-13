package com.kyleanderson;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts " +
                    "(name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Joe',456780,'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jane',98765,'jane@somewhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Joe',0000953,'dog@email.com')");

//            statement.execute("UPDATE contacts SET name='Fido' WHERE email='dog@email.com'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");

            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " "  +
                        results.getString("email"));
            }

            statement.close();
            conn.close();

        } catch(SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

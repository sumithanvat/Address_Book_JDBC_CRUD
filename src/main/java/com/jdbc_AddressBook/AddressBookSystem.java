package com.jdbc_AddressBook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookSystem {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/address_bookdb";
        String username = "root";
        String password = "Sumit@123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // create table

            try (Statement statement = connection.createStatement()) {
                String createTableQuery = "create table address_book2 (id INT primary key,first_name varchar(20),last_name varchar(20),address varchar(50),city Varchar(20),state varchar(20),zip int,phone varchar(20),email varchar(20))";
                statement.executeUpdate(createTableQuery);
                System.out.println("Table is created");
            }
            try (Statement statement = connection.createStatement()) {
                String insertQuery = "insert into address_book2 (id,first_name,last_name,address,city,state,zip,phone,email) values (1,'Sumit','Hanvat','Jabalpur','LKD','MP','480448','95858858','AVC@gmaiol.com')";
                statement.executeUpdate(insertQuery);
                System.out.println("value inserted successfully");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
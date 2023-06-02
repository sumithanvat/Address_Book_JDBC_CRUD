package com.jdbc_AddressBook;

import java.sql.*;

public class AddressBookSystem {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/address_bookdb";
        String username = "root";
        String password = "Sumit@123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            // Update Entry
                try (Statement statement = connection.createStatement()) {
                    String updateQuery = "update address_book2 set phone = '7581800900'";
                    int rowsAffected = statement.executeUpdate(updateQuery);

                    if (rowsAffected > 0) {
                        System.out.println("Entry updated successfully");
                    } else {
                        System.out.println("No entry found to update");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

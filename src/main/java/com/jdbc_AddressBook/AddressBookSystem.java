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
                    String deleteQuery = "delete from address_book2 where first_name = 'Sumit'";
                    int rowsAffected = statement.executeUpdate(deleteQuery);

                    if (rowsAffected > 0) {
                        System.out.println("Entry Delete successfully");
                    } else {
                        System.out.println("No entry found to Delete");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

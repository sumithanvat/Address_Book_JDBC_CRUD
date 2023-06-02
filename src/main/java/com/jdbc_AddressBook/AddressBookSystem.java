package com.jdbc_AddressBook;

import java.sql.*;

public class AddressBookSystem {
    public static void main(String[] args) {


        String url = "jdbc:mysql://localhost:3306/address_bookdb";
        String username = "root";
        String password = "Sumit@123";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            // Update query
            try (Statement statement = connection.createStatement()){
                String selectQuery = "select * from address_book2";
                ResultSet resultSet = statement.executeQuery(selectQuery);

                // Iterate over result set
                while (resultSet.next()){
                    int id = resultSet.getInt(1);
                    String first_name = resultSet.getString(2);
                    String last_name = resultSet.getString(3);
                    String address = resultSet.getString(4);
                    String city = resultSet.getString(5);
                    String state = resultSet.getString(6);
                    int zip = resultSet.getInt(7);
                    String phone = resultSet.getString(8);
                    String email = resultSet.getString(9);

                    // Print the retrieved values
                    System.out.println("ID: " + id);
                    System.out.println("First Name: " + first_name);
                    System.out.println("Last Name: " + last_name);
                    System.out.println("Address: " + address);
                    System.out.println("City: " + city);
                    System.out.println("State: " + state);
                    System.out.println("ZIP: " + zip);
                    System.out.println("Phone: " + phone);
                    System.out.println("Email: " + email);
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
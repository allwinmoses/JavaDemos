package com.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreUpdate {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/voyatraining";
        String username = "root";
        String password = "root";

        String sql = "Update cab set driver_name=? where cab_number=?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                int cabNumber = scanner.nextInt();
                String drop = scanner.next();
                String pickup = scanner.next();
                String time = scanner.next();
                String date = scanner.next();
                String driverName = scanner.next();


                preparedStatement.setInt(1, cabNumber);
                preparedStatement.setString(2, pickup);
                preparedStatement.setString(3, drop);
                preparedStatement.setTime(4, Time.valueOf(time));
                preparedStatement.setDate(5, Date.valueOf(date));
                preparedStatement.setString(6, driverName);
                boolean result = preparedStatement.execute();
                System.out.println(result);


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

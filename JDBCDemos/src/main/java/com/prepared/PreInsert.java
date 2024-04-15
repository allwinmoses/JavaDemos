package com.prepared;

import java.sql.*;
import java.util.Scanner;

public class PreInsert {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username ="root";
        String password ="root";
        String sql = "insert into cab values(?,?,?,?,?,?)";
        Connection connection =null;
        PreparedStatement statement =null;

        try {
            connection = DriverManager.getConnection(url, username, password);
            statement = connection.prepareStatement(sql);


               {
                Scanner scanner = new Scanner(System.in);
                for(int i = 0;i<5;i++){
                    int cabNumber = scanner.nextInt();
                    String drop = scanner.next();
                    String pickup = scanner.next();
                    String time = scanner.next();
                    String date = scanner.next();
                    String driverName =scanner.next();


                    statement.setInt(1,cabNumber);
                    statement.setString(2,pickup);
                    statement.setString(3,drop);
                    statement.setTime(4, Time.valueOf(time));
                    statement.setDate(5,Date.valueOf(date));
                    statement.setString(6,driverName);
                    boolean result = statement.execute();
                    System.out.println(result);
                }


               }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
            }

    }


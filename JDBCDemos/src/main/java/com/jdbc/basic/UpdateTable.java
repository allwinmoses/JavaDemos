package com.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username ="root";
        String password ="root";

        try (
                Connection connection = DriverManager.getConnection(url,username,password);
                Statement statement = connection.createStatement();){
            String sql=
                    "update into employee values('Moses',2,'Bangalore')";
            boolean result = statement.execute(sql);
            System.out.println(("Data Updated "+ !result));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        };
    }
}

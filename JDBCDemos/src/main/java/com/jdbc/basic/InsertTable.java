package com.jdbc.basic;

import java.sql.*;

public class InsertTable {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/voyatraining";
        String username ="root";
        String password ="root";

         try (
           Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();){
                String sql=
                        "insert into employee values('Allwin',1,'Bangalore')";
                boolean result = statement.execute(sql);
                System.out.println(("Data inserted "+ result));

            } catch (SQLException e) {
             System.out.println(e.getMessage());
//            throw new RuntimeException(e);
        };

    }
}

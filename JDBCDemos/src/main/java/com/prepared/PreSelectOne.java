//package com.prepared;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class PreSelectOne {
//    public static void main(String[] args) {
//        String url ="jdbc:mysql://localhost:3306/voyatraining";
//        String username ="root";
//        String password ="root";
//        String sql = "select * from cab where drop_loc=?";
//
//        try(
//                Connection connection = DriverManager.getConnection(url, username,password);
//                PreparedStatement statement = connection.prepareStatement(sql);
//                ){
//            statement.setString(1,"Hoodi");
//            try(ResultSet rs = statement.executeQuery()
//                while(rs.next()){
//            int cabNumber = rs.getInt("cab_number");
//
//        }
//    }
//}

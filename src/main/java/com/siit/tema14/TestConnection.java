package com.siit.tema14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConnection {
    static TestConnection object = new TestConnection();

    public static void main(String[] args) {
        object.delete(50);
    }

    public  void delete (int deptno){
        PreparedStatement preparedStatement = getPreparedStatement ("delete from dept where deptno=?");
        int rowsAffected = 0;
        try {
            preparedStatement.setInt(1, deptno);
            //setInt(1, deptno);
            rowsAffected=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error while deleting from dept/hr");
            throw new MyFirstSQLException(e);
        }
        if (rowsAffected>0){
            System.out.println("am reusit sa sterg");
        }else{
            System.out.println("Mai incearca");
        }
    }


    private PreparedStatement getPreparedStatement (String query) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr?serverTimezone=EET",
                    "siit",
                    "siit");
            return connection.prepareStatement(query);
        } catch (SQLException throwable) {
            System.out.println("Error while getting connection");
            throw new RuntimeException("Error while getting connection", throwable);

        }
    }
}

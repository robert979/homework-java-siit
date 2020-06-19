package com.siit.tema14.jdbc.repository;

import com.siit.tema14.jdbc.domain.DEPT;
import com.siit.tema14.jdbc.domain.DEPTCommands;
import com.siit.tema14.jdbc.myexceptions.MyCustomException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DEPTImpl implements DEPTCommands {

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

    @Override
    public void createNewRow(DEPT dept) {
        String query ="INSERT INTO dept VALUES(?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedRows =0;

        try {
        preparedStatement.setInt(1, dept.getDEPTNO());
        preparedStatement.setString(2, dept.getDNAME());
        preparedStatement.setString(3, dept.getCITY());

        modifiedRows=preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception as no new row was created");
            throw new MyCustomException(e);
        }if (modifiedRows>0){
            System.out.println("You have successfully updated " + modifiedRows + " rows");
        }else {
            System.out.println("No row was added, please try again");
        }


    }

    @Override
    public void deleteRow(int deptno) {

    }
}

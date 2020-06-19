package com.siit.tema14.jdbc.hr.repository;

import com.siit.tema12.festival.domain.Gate;
import com.siit.tema14.jdbc.hr.domain.DEPT;
import com.siit.tema14.jdbc.hr.domain.DEPTCommands;
import com.siit.tema14.jdbc.hr.myexceptions.MyCustomException;
import lombok.SneakyThrows;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DEPTImpl implements DEPTCommands {


    @SneakyThrows
    @Override
    public void updateDeptNameNew(int deptno, String deptname) {
        String query = "UPDATE dept SET dname=? WHERE deptno=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedCell=0;
        preparedStatement.setString(1, deptname);
        preparedStatement.setInt(2, deptno);
        modifiedCell=preparedStatement.executeUpdate();

        if (modifiedCell>0){
            System.out.println("The Department name corresponding to Department Number " +deptno +"" +
                    " was successfully changed to " + deptname );
        }else {
            System.out.println("The department name was not changed, pleas try again");
        }
    }


    @SneakyThrows
    @Override
    public void updateCity(int deptno, String cityName) {
        String query = "UPDATE dept SET city=? WHERE deptno=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedCell=0;
        preparedStatement.setString(1, cityName);
        preparedStatement.setInt(2, deptno);
        modifiedCell=preparedStatement.executeUpdate();

        if (modifiedCell>0){
            System.out.println("The City corresponding to Department Number " + deptno + " was changed to " + cityName );
        }else {
            System.out.println("The city name was not changed");
        }
    }
    @SneakyThrows
    @Override
    public void updateDeptName(int deptno, String deptName) { //nu merge ??????
        String query = "UPDATE dept SET dname = ? WHERE deptno = ?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedCell =0;
        preparedStatement.setString(1, deptName);
        preparedStatement.setInt(2, deptno);

        if (modifiedCell>0){
            System.out.println("The Department name corresponding to Department Number " +deptno +"" +
                    "was successfully changed to " + deptName);
        }else {
            System.out.println("The department name was not changed, pleas try again");
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

        modifiedRows= modifiedRows+preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception as no new row was created");
            throw new MyCustomException(e);
        }if (modifiedRows>0){
            System.out.println("You have successfully updated " + modifiedRows + " rows");
        }else {
            System.out.println("No row was added, please try again");
        }


    }
    public void createNewRowByValues (int deptno, String dname, String city) {
        String query ="INSERT INTO dept VALUES(?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedRows =0;

        try {
            preparedStatement.setInt(1,deptno);
            preparedStatement.setString(2, dname);
            preparedStatement.setString(3, city);

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

    @SneakyThrows
    @Override
    public void deleteRow(int deptno) {
        String query = "DELETE FROM dept where DEPTNO=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);

        int modifiedRows =0 ;

        preparedStatement.setInt(1, deptno);
        modifiedRows=preparedStatement.executeUpdate();

        if(modifiedRows>0){
            System.out.println("You have successfully deleted one row, corresponding to Department Number " +deptno);
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

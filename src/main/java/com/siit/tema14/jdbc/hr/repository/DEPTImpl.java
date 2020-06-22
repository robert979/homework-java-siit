package com.siit.tema14.jdbc.hr.repository;


import java.sql.ResultSet;

import com.siit.tema14.jdbc.hr.domain.DEPT;
import com.siit.tema14.jdbc.hr.domain.DEPTCommands;
import com.siit.tema14.jdbc.hr.myexceptions.MyCustomException;
import com.sun.org.apache.bcel.internal.generic.PUSH;
import lombok.SneakyThrows;


import java.sql.*;


public class DEPTImpl implements DEPTCommands {


    @SneakyThrows
    public int findRowNumbers(String column_name, String tableName) {
        int a = 0;
        String query = " Select count(" + column_name + ") from " + tableName + "";
        PreparedStatement statement = getPreparedStatement(query);

        // statement.setString(1, column_name);
        // statement.setString(2, tableName);


        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            a = rs.getInt("count(" + column_name + ")");
        }
        return a;
    }


    @SneakyThrows
    public String findPrimaryKey() {

        String query = "show columns from dept where `Key` = \"PRI\"";
        PreparedStatement statement = getPreparedStatement(query);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            query = rs.getString("Field");
        }

        return query;

    }


    @SneakyThrows
    public String readCityNameAndDepName(int deptno) {
        String result = null;

        String query = "select city, dname from dept where deptno=?";
        PreparedStatement statement = getPreparedStatement(query);

        statement.setInt(1, deptno);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            result = "For Department Number " + deptno + " the corresponding city is " + rs.getString("city") + " and " +
                    "the Department Name is " + rs.getString("dname");
        }


        return result;


    }


    @SneakyThrows
    @Override
    public void updateDeptNameNew(int deptno, String deptname) {
        String query = "UPDATE dept SET dname=? WHERE deptno=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedCell = 0;
        preparedStatement.setString(1, deptname);
        preparedStatement.setInt(2, deptno);
        modifiedCell = preparedStatement.executeUpdate();

        if (modifiedCell > 0) {
            System.out.println("The Department name corresponding to Department Number " + deptno + "" +
                    " was successfully changed to " + deptname);
        } else {
            System.out.println("The department name was not changed, pleas try again");
        }
    }


    @SneakyThrows
    @Override
    public void updateCity(int deptno, String cityName) {
        String query = "UPDATE dept SET city=? WHERE deptno=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        preparedStatement.setString(1, cityName);
        preparedStatement.setInt(2, deptno);

        int modifiedRows = preparedStatement.executeUpdate();
        if (modifiedRows > 0) {
            System.out.println("The City corresponding to Department Number " + deptno + " was changed to " + cityName);
        } else {
            System.out.println("The department name was not changed, please try again");
        }
    }

    @SneakyThrows
    @Override
    public void updateDeptName(int deptno, String deptName) { //nu merge ??????
        String query = "UPDATE dept SET dname = ? WHERE deptno = ?";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedCell = 0;
        preparedStatement.setString(1, deptName);
        preparedStatement.setInt(2, deptno);
        modifiedCell = preparedStatement.executeUpdate();

        if (modifiedCell > 0) {
            System.out.println("The Department name corresponding to Department Number " + deptno + "" +
                    "was successfully changed to " + deptName);
        } else {
            System.out.println("The department name was not changed, please try again");
        }
    }


    @Override
    public void createNewRow(DEPT dept) {
        String query = "INSERT INTO dept VALUES(?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedRows = 0;

        try {
            preparedStatement.setInt(1, dept.getDEPTNO());
            preparedStatement.setString(2, dept.getDNAME());
            preparedStatement.setString(3, dept.getCITY());

            modifiedRows = modifiedRows + preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception as no new row was created");
            throw new MyCustomException(e);
        }
        if (modifiedRows > 0) {
            System.out.println("You have successfully updated " + modifiedRows + " rows");
        } else {
            System.out.println("No row was added, please try again");
        }


    }

    public void createNewRowByValues(int deptno, String dname, String city) {
        String query = "INSERT INTO dept VALUES(?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        int modifiedRows = 0;

        try {
            preparedStatement.setInt(1, deptno);
            preparedStatement.setString(2, dname);
            preparedStatement.setString(3, city);

            modifiedRows = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Exception as no new row was created");
            throw new MyCustomException(e);
        }
        if (modifiedRows > 0) {
            System.out.println("You have successfully updated " + modifiedRows + " rows");
        } else {
            System.out.println("No row was added, please try again");
        }


    }

    @SneakyThrows
    @Override
    public void deleteRow(int deptno) {
        String query = "DELETE FROM dept where DEPTNO=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);

        int modifiedRows = 0;

        preparedStatement.setInt(1, deptno);
        modifiedRows = preparedStatement.executeUpdate();

        if (modifiedRows > 0) {
            System.out.println("You have successfully deleted one row, corresponding to Department Number " + deptno);
        }


    }


    private PreparedStatement getPreparedStatement(String query) {
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

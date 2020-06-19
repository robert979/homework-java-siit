package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.OrderDAO;
import com.siit.tema14.jdbc.hr.myexceptions.MyCustomException;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OderDAOImpl implements OrderDAO {

    @Override
    public void create(int deptno, String dname, String city) {
        String query = "INSERT INTO dept VALUES(?,?,?);";
        PreparedStatement preparedStatement = getPreparedStatement(query);

        int affectedRows = 0;

        try {
            preparedStatement.setInt(1, deptno);
            preparedStatement.setString(2, dname);
            preparedStatement.setString(3, city);
            affectedRows = preparedStatement.executeUpdate();

        } catch ( SQLException e) {
            System.out.println("This is create error");
           throw new MyCustomException(e);
        }if (affectedRows>0){
            System.out.println("you have successfully created one row");
        }else {
            System.out.println("No row created, please try again");
        }

    }

    @Override
    public void update() {

    }

    @Override
    public void read() {

    }



    @SneakyThrows
    @Override
    public void delete(int deptno) {
        String query = "DELETE FROM dept where DEPTNO=?";
        PreparedStatement preparedStatement = getPreparedStatement(query);

        int modifiedRows =0 ;

        preparedStatement.setInt(1, deptno);
        modifiedRows=preparedStatement.executeUpdate();

        if(modifiedRows>0){
            System.out.println("You have successfully deleted one row, corresponding to " +deptno);
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

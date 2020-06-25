package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.Orders;
import com.siit.tema14.jdbc.hr.myexceptions.MyCustomException;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrdersDAORepositoryIMPL implements OrdersDAORepository {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd,yyyy, HH:mm:ss a");
    private DateTimeFormatter formatSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @Override
    public void update(int orderNumber) {

    }

    @Override
    public void read(int orderNumber, LocalDate localDate) {
        String

    }

    @SneakyThrows
    @Override
    public void create(Orders order) {
        String query = "INSERT INTO orders VALUES(?, ?, ?, ?, ?, ?, ?)";
        // "INSERT INTO orders(orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber) " +
        //                "VALUES(?,?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = getPreparedStatement(query);

        preparedStatement.setInt(1, order.getOrderNumber());
        preparedStatement.setString(2, order.getOrderDate().format(formatSQL));
        preparedStatement.setString(3, order.getRequiredDate().format(formatSQL));
        preparedStatement.setString(4, order.getShippedDate().format(formatSQL));
        preparedStatement.setString(5, order.getStatus().toString().replace("_"," "));
        preparedStatement.setString(6, order.getComments());
        preparedStatement.setInt(7, order.getCustomerNumber());

if (preparedStatement.executeUpdate()>0){
    System.out.println("Your Order Number " + order.getOrderNumber() + " was successfully added ro orders table");
}
    }

    @Override
    public void delete(int orderNumber) {

    }
    private PreparedStatement getPreparedStatement(String query) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=EET",
                    "siit",
                    "siit");
            return connection.prepareStatement(query);
        } catch (SQLException throwable) {
            System.out.println("Error while getting connection");
            throw new RuntimeException("Error while getting connection", throwable);

        }
    }


}

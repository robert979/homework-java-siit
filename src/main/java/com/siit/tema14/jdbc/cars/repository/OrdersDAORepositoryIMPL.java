package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.Orders;
import com.siit.tema14.jdbc.hr.myexceptions.MyCustomException;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OrdersDAORepositoryIMPL implements OrdersDAORepository {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd,yyyy, HH:mm:ss a");
    private DateTimeFormatter formatSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");


    @Override
    public void readComments(int orderNumber) {

    }

    @SneakyThrows
    @Override
    public LocalDate readDate(int orderNumber) {
        LocalDate orderDate = LocalDate.now();
        //DateTimeFormatter dateFormatter= DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String query = "Select orderDate from orders where orderNumber=? ";
        PreparedStatement preparedStatement = getPreparedStatement(query);

        preparedStatement.setInt(1, orderNumber);

        ResultSet rs =  preparedStatement.executeQuery();

        while (rs.next()){
            orderDate = LocalDate.parse(rs.getString("orderDate"), formatSQL);
            //System.out.println("The date for Order Number " + orderNumber + " is " + rs.getString("orderDate"));
            System.out.println("The date for Order Number " + orderNumber + " is " + orderDate);
        }
        return orderDate;
    }

    @SneakyThrows
    @Override
    public void update(int orderNumber, LocalDate localDate) {
        String query = "Update orders set orderDate=? where orderNumber=?";

        PreparedStatement statement= getPreparedStatement(query);

        statement.setString(1, localDate.format(formatSQL));
        statement.setInt(2, orderNumber);

        if (statement.executeUpdate()>0){
            System.out.println("for Order Number " + orderNumber + " the Order Date was changed to " + localDate.format(formatSQL));
        }

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
    System.out.println("Your Order Number " + order.getOrderNumber() + " was successfully added to orders table");
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

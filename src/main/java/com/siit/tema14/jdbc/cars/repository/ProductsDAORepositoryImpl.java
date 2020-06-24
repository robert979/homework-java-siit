package com.siit.tema14.jdbc.cars.repository;


import com.siit.tema14.jdbc.cars.domanin.Products;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
@AllArgsConstructor
public class ProductsDAORepositoryImpl implements ProductsDAORepository{

    @Autowired
    private final JdbcTemplate jdbcTemplate;

    /*public void create(Products product) {
        jdbcTemplate.update
                ("Insert INTO products (productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)",
                product.getProductCode(),
                product.getProductName(),
                product.getProductLine(),
                product.getProductScale(),
                product.getProductVendor(),
                product.getProductDescription(),
                product.getQuantityInStock(),
                product.getBuyPrice(),
                product.getMSRP());

    }

     */


    @SneakyThrows
    @Override
   public void create(Products product) {
        //(productCode, productName, productLine, productScale, productVendor, productDescription, quantityInStock, buyPrice, MSRP)

        String query = "Insert INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = getPreparedStatement(query);
        preparedStatement.setString(1, product.getProductCode());
        preparedStatement.setString(2, product.getProductName());
        preparedStatement.setString(3, product.getProductLine().toString().replace("_"," "));
        preparedStatement.setString(4, product.getProductScale());
        preparedStatement.setString(5, product.getProductVendor());
        preparedStatement.setString(6, product.getProductDescription());
        preparedStatement.setInt(7, product.getQuantityInStock());
        preparedStatement.setBigDecimal(8, product.getBuyPrice());
        preparedStatement.setBigDecimal(9, product.getMSRP());

        //int modifiedRow = 0;
       // modifiedRow =preparedStatement.executeUpdate();

        if (preparedStatement.executeUpdate() > 0) {
            System.out.println("You have successfully updated the product code " +product.getProductCode());
        } else {
            System.out.println("No row was added, please try again");
        }



    }



    @Override
    public void read() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

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

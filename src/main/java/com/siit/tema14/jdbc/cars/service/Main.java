package com.siit.tema14.jdbc.cars.service;

import com.siit.tema14.jdbc.cars.domanin.Orders;
import com.siit.tema14.jdbc.cars.domanin.ProductLine;
import com.siit.tema14.jdbc.cars.domanin.Products;
import com.siit.tema14.jdbc.cars.domanin.Status;
import com.siit.tema14.jdbc.cars.repository.OrdersDAORepositoryIMPL;
import com.siit.tema14.jdbc.cars.repository.ProductsDAORepositoryImpl;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {




    static List<Products> productsList = Arrays.asList(
            new Products("S10_" + new Random().nextInt(10000), "Dacia Sandero", ProductLine.Classic_Cars, "1:50", "Groupe Renault",
                    "Este cea mai buna masina Romaneasca din toate timpurile", 325, BigDecimal.valueOf(15200.50), BigDecimal.valueOf(17350.55)));

    static List<Orders> ordersList = Arrays.asList(
            new Orders(1000,LocalDate.of(1979, 02, 19),LocalDate.of(1980, 01, 05),LocalDate.of(1979, 12, 4), Status.Shipped,
                    "Marfa a fost livrata cu succes",121)
    );

    private static DateTimeFormatter formatSQL = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) throws SQLException {
        ProductsDAORepositoryImpl newProduct = new ProductsDAORepositoryImpl(new JdbcTemplate());
        OrdersDAORepositoryIMPL newOrder = new OrdersDAORepositoryIMPL();
        //newProduct.create(productsList.get(0));
        //newProduct.read("S10_6485");
        //newProduct.updatePrice("S10_1678",BigDecimal.valueOf(42.699));
        //newProduct.setPrice();
        //newProduct.delete("S10_6485");

        //newOrder.create(ordersList.get(0));

        System.out.println("order number " +ordersList.get(0).getOrderNumber() +
                "\norder date " + ordersList.get(0).getOrderDate().format(formatSQL) +
                "\norder status " + ordersList.get(0).getStatus() +
                "\ncomment " + ordersList.get(0).getComments() +
                "\ncostumer number " + ordersList.get(0).getCustomerNumber());
    }

}


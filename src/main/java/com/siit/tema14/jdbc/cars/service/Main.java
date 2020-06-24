package com.siit.tema14.jdbc.cars.service;

import com.siit.tema14.jdbc.cars.domanin.ProductLine;
import com.siit.tema14.jdbc.cars.domanin.Products;
import com.siit.tema14.jdbc.cars.repository.ProductsDAORepositoryImpl;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    static List<Products> productsList = Arrays.asList(
            new Products("S10_" + new Random().nextInt(10000), "Dacia Sandero", ProductLine.Classic_Cars, "1:50", "Groupe Renault",
                    "Este cea mai buna masina Romaneasca din toate timpurile", 325, BigDecimal.valueOf(15200.50), BigDecimal.valueOf(17350.55)));

    public static void main(String[] args) {
        ProductsDAORepositoryImpl newProduct = new ProductsDAORepositoryImpl(new JdbcTemplate());
        newProduct.create(productsList.get(0));
    }
}


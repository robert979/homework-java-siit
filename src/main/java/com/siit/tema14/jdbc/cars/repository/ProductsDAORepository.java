package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.Products;

import java.math.BigDecimal;

public interface ProductsDAORepository {
    void create(Products product);
    void read(String productCode);
    void updatePrice(String productCode, BigDecimal bigDecimal);
    void delete(String productCode);

}

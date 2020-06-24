package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.Products;

public interface ProductsDAORepository {
    void create(Products product);
    void read();
    void update();
    void delete();

}

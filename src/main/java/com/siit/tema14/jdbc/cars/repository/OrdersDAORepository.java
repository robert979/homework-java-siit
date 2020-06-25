//(create, read, update, delete),
package com.siit.tema14.jdbc.cars.repository;

import com.siit.tema14.jdbc.cars.domanin.Orders;

import java.time.LocalDate;

public interface OrdersDAORepository {

void update(int orderNumber);
void read(int orderNumber, LocalDate localDate);
void create(Orders order);
void delete(int orderNumber);


}

//(create, read, update, delete),
package com.siit.tema14.jdbc.cars.repository;

public interface OrdersDAORepository {

void update();
void read();
void create(int deptno, String dname, String city);
void delete(int deptno);


}

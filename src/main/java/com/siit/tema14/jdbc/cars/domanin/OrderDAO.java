//(create, read, update, delete),
package com.siit.tema14.jdbc.cars.domanin;

public interface OrderDAO {

void update();
void read();
void create(int deptno, String dname, String city);
void delete();


}

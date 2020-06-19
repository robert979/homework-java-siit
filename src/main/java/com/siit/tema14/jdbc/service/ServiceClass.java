package com.siit.tema14.jdbc.service;
import com.siit.tema14.jdbc.cars.repository.OderDAOImpl;
import com.siit.tema14.jdbc.domain.DEPT;

import java.util.Arrays;
import java.util.List;

public class ServiceClass {
   static List<DEPT> listDept = Arrays.asList(
           new DEPT(90,"ENGINEERING","BUCURESTI"),
           new DEPT(100, "HR","MIOVENI"),
           new DEPT(110, "LOGISTIC", "BUCURESTI")
   );

    public static void main(String[] args) {


    }
}

package com.siit.tema14.jdbc.hr.service;

import com.siit.tema14.jdbc.hr.domain.DEPT;
import com.siit.tema14.jdbc.hr.repository.DEPTImpl;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class ServiceDept {

    static DEPTImpl deptiml;
    public static void create (DEPT dept){
        deptiml.createNewRow(dept);
    }


   static List<DEPT> listDept = Arrays.asList(
           new DEPT(130,"ENGINEERING","BUCURESTI"),
           new DEPT(140, "HR","MIOVENI"),
           new DEPT(150, "LOGISTIC", "BUCURESTI"),
           new DEPT(160,"ENGINEERING","MIOVENI")
   );

    public static void main(String[] args) throws SQLException {
        DEPTImpl newDeptIml = new DEPTImpl();

        //newDeptIml.createNewRowByValues(90,"ENGINEERING","BUCURESTI");
        //newDeptIml.deleteRow(90);

        //for (DEPT dept:listDept){
        //   newDeptIml.createNewRow(dept);
        //}

        //newDeptIml.updateCity(160,"CLUJ");
        //newDeptIml.updateDeptName(150, "MANUFACTURING");

        //newDeptIml.updateDeptName(150, "PRINTING");
        //newDeptIml.updateCity(150, "IAS");
        //newDeptIml.updateDeptNameNew(160, "PRINTING");

        System.out.println(newDeptIml.readCityName(150));


    }
}

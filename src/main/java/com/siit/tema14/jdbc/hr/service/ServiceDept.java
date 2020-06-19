package com.siit.tema14.jdbc.hr.service;

import com.siit.tema14.jdbc.hr.domain.DEPT;
import com.siit.tema14.jdbc.hr.repository.DEPTImpl;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class ServiceDept {

    static DEPTImpl deptiml;
    public void create (DEPT dept){
        deptiml.createNewRow(dept);
    }


   static List<DEPT> listDept = Arrays.asList(
           new DEPT(90,"ENGINEERING","BUCURESTI"),
           new DEPT(100, "HR","MIOVENI"),
           new DEPT(110, "LOGISTIC", "BUCURESTI"),
           new DEPT(120,"ENGINEERING","MIOVENI")
   );

    public static void main(String[] args) {
        DEPTImpl newDeptIml = new DEPTImpl();


        //newDeptIml.createNewRowByValues(90,"ENGINEERING","BUCURESTI");
        newDeptIml.deleteRow(90);


    }
}

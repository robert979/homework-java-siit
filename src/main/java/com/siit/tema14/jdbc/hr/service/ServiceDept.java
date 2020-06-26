package com.siit.tema14.jdbc.hr.service;

import com.siit.tema14.jdbc.hr.domain.DEPT;
import com.siit.tema14.jdbc.hr.repository.DEPTRepositoryImpl;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
public class ServiceDept {

    static DEPTRepositoryImpl deptiml;
    public static void create (DEPT dept){
        deptiml.createNewRow(dept);
    }
    static List<Integer> deptNo = Arrays.asList(
            10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160);


   static List<DEPT> listDept = Arrays.asList(
           new DEPT(130,"ENGINEERING","BUCURESTI"),
           new DEPT(140, "HR","MIOVENI"),
           new DEPT(150, "LOGISTIC", "BUCURESTI"),
           new DEPT(160,"ENGINEERING","MIOVENI")
   );

    public static void main(String[] args) throws SQLException {
        DEPTRepositoryImpl newDeptIml = new DEPTRepositoryImpl();

        //newDeptIml.createNewRowByValues(90,"ENGINEERING","BUCURESTI");
        //newDeptIml.deleteRow(90);

        //for (DEPT dept:listDept){
        //   newDeptIml.createNewRow(dept);
        //}

        //newDeptIml.updateCity(160,"CLUJ");
        //newDeptIml.updateDeptName(150, "MANUFACTURING");

        //newDeptIml.updateDeptName(150, "PRINTING");
        //newDeptIml.updateCity(150, "IASI");
        //newDeptIml.updateDeptNameNew(160, "PRINTING");

        //System.out.println(newDeptIml.readCityName(150));

       //for (Integer integer: deptNo){
       //    System.out.println(newDeptIml.readCityNameAndDepName(integer));
       //}

        //System.out.println(newDeptIml.findPrimaryKey());
        //System.out.println(newDeptIml.findRowNumbers("id","employee"));
       // newDeptIml.updateDeptName(150, "LOGISTIC");
       // deptiml.updateDeptName(150,"LOGISTIC");
        //newDeptIml.addColumnAutoIncrement("employee");
        //System.out.println(newDeptIml.findAutIncrementColumn("employee"));

        //newDeptIml.findColumnType("employee","mycolumn");
        //System.out.println(newDeptIml.findDataTypeColumn("employee","mycolumn"));

        newDeptIml.getAllRows();


    }
}

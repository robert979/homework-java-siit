package com.siit.tema14.jdbc.hr.domain;

public interface DEPTCommands {

    void createNewRow(DEPT dept);
    void deleteRow(int deptno);
    void updateCity(int deptno,String cityName);
    void updateDeptName (int deptno, String deptNamne);
    void updateDeptNameNew(int deptno, String deptname);


}

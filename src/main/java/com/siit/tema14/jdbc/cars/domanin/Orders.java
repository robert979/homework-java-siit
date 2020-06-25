package com.siit.tema14.jdbc.cars.domanin;

import lombok.Getter;

import java.sql.Date;
import java.time.LocalDate;

@Getter
public class Orders {
    private int orderNumber;
    private LocalDate orderDate;
    private LocalDate requiredDate;
    private LocalDate shippedDate;
    private Status status;
    private String comments;
    private int customerNumber;

    public Orders(int orderNumber, LocalDate orderDate, LocalDate requiredDate, LocalDate shippedDate, Status status, String comments, int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
        this.customerNumber = customerNumber;
    }
}


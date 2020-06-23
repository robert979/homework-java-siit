package com.siit.tema14.jdbc.cars.domanin;

import lombok.Data;

@Data

public class Products {
    private String productCode;
    private String productName;
    private ProductLine productLine;
    private String productScale;
    private String productVendor;
    private String productDescription;
    private int quantityInStock;
    private float buyPrice;
    private float MSRP;


    public Products(String productCode, ProductLine productLine, float MSRP) {
        this.productCode = productCode;
        this.productLine = productLine;
        this.MSRP = MSRP;
    }

    public static void main(String[] args) {
        Products newProduct = new Products("LS201", ProductLine.Classic_Cars,10.55F);
        System.out.println(newProduct.getProductLine().toString().replace("_"," ") +" \n"
                + newProduct.getMSRP());
    }
}

package com.siit.tema14.jdbc;

import com.siit.tema14.jdbc.cars.domanin.ProductLine;
import com.siit.tema14.jdbc.cars.domanin.Products;
import com.siit.tema14.jdbc.cars.repository.ProductsDAORepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ApplicationContext applicationContext;

    private static SpringApplication springApplication = new SpringApplication(Application.class);
    static List<Products> productsList = Arrays.asList(
            new Products("S10_1680","Dacia Duster", ProductLine.Planes,"1:50","Groupe Renault",
                    "Este cea mai buna masina Romaneasca din toate timpurile",325, BigDecimal.valueOf(15200.50),BigDecimal.valueOf(17350.55)));

    public static void main(String[] args) {

        springApplication.run(args);

    }

    @Override
    public void run(String... args) throws Exception {
        ProductsDAORepositoryImpl productsDAORepository = (ProductsDAORepositoryImpl) applicationContext.getBean("ProductsDAORepositoryImpl");
        //productsDAORepository.create(productsList.get(0));

    }
}

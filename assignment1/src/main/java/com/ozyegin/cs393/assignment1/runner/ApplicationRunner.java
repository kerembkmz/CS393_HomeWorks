package com.ozyegin.cs393.assignment1.runner;

import com.ozyegin.cs393.assignment1.beans.ProductBean;

import com.ozyegin.cs393.assignment1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {
    @Autowired
    private ProductBean productBean;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Product PegasusShield = new Product(1,"Nike Pegasus Shield", 4599.90);
        Product PegasusTrail = new Product(2,"Nike Pegasus Trail 4 GORE-TEX", 5099.90);
        Product WinfloShield = new Product(3,"Nike Winflo 9 Shield", 3999.90);
        Product Vaporfly = new Product(4,"Nike Vaporfly 3", 7799.90);

        productBean.getProductList().add(PegasusShield);
        productBean.getProductList().add(PegasusTrail);
        productBean.getProductList().add(WinfloShield);
        productBean.getProductList().add(Vaporfly);
    }
}

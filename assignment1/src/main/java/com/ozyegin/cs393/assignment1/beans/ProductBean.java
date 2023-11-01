package com.ozyegin.cs393.assignment1.beans;
import com.ozyegin.cs393.assignment1.model.Product;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class ProductBean {
    private List<Product> productList=new ArrayList<Product>();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}


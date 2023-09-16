package com.lcwd.orm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories=new ArrayList<>();

    public Product() {
    }

    public Product(String pId, String productName) {
        this.pId = pId;
        this.productName = productName;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "product{" +
                "pId='" + pId + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}

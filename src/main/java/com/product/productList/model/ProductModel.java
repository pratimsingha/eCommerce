package com.product.productList.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId", nullable = false)
    private Integer productId;
    @Column(name = "productName", nullable = false)
    private String productName;
    @Column(name = "productDescription", nullable = false)
    private String productDescription;
    @Column(name = "productPrice", nullable = false)
    private String productPrice;
    @Column(name = "sellerId", nullable = false)
    private Integer sellerId;
    @Column(name = "productCategoryId", nullable = false)
    private Integer productCategoryId;
    @Column(name = "stock", nullable = false)
    private Integer stock;

    public ProductModel(){}
    public ProductModel(String productName, String productDescription, String productPrice, Integer sellerId, Integer productCategoryId, Integer stock) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
        this.sellerId = sellerId;
        this.productCategoryId = productCategoryId;
        this.stock = stock;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Integer productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}



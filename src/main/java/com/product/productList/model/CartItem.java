package com.product.productList.model;

import javax.persistence.*;

@Entity
@Table(name = "cart")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cardItemId", nullable = false)
    private Integer cardItemId;
    @Column(name = "customerId", nullable = false)
    private Integer customerId;
    @Column(name = "productId", nullable = false)
    private Integer productId;
    @Column(name = "wishlist", nullable = false)
    private Boolean wishlist;
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    public Integer getCardItemId() {
        return cardItemId;
    }

    public void setCardItemId(Integer cardItemId) {
        this.cardItemId = cardItemId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Boolean getWishlist() {
        return wishlist;
    }

    public void setWishlist(Boolean wishlist) {
        this.wishlist = wishlist;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

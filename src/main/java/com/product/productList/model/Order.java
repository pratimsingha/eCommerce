package com.product.productList.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "orderDetails")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer orderId;
    @Column(name = "customerId", nullable = false)
    private Integer customerId;
    @Column(name = "addressId", nullable = false)
    private Integer addressId;
    @Column(name = "timeAdded", nullable = false)
    private Date timeAdded;
    @Column(name = "statusOrder", nullable = false)
    private String statusOrder;
    @Column(name = "price", nullable = false)
    private Integer price;
    @Column(name = "paymentId", nullable = false)
    private Integer paymentId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Date getTimeAdded() {
        return timeAdded;
    }

    public void setTimeAdded(Date timeAdded) {
        this.timeAdded = timeAdded;
    }

    public String getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(String statusOrder) {
        this.statusOrder = statusOrder;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }
}

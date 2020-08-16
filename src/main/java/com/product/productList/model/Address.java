package com.product.productList.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class  Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addressId", nullable = false)
    private Integer cardItemId;
    @Column(name = "customerId", nullable = false)
    private Integer customerId;
    @Column(name = "fullName", nullable = false)
    private String fullName;
    @Column(name = "contact", nullable = false)
    private String contact;
    @Column(name = "emailAddress", nullable = false)
    private String emailAddress;
    @Column(name = "addressLine1", nullable = false)
    private String addressLine1;
    @Column(name = "addressLine2", nullable = false)
    private String addressLine2;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "pinCode", nullable = false)
    private String pinCode;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}

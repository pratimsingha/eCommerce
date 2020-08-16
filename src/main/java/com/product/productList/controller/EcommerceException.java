package com.product.productList.controller;

public class EcommerceException extends RuntimeException {
    public EcommerceException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}

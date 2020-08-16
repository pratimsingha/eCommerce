package com.product.productList.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(EcommerceException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public EcommerceException handlerException(EcommerceException ecommerceException) {
        return ecommerceException;
    }
}

package com.product.productList.controller;

import com.product.productList.dao.AddressDao;
import com.product.productList.dao.CartDao;
import com.product.productList.dao.OrderDao;
import com.product.productList.dao.ProductDao;
import com.product.productList.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private CartDao cartDao;

    @Autowired
    private AddressDao addressDao;

    @Autowired
    private OrderDao orderDao;


    @PostMapping(value = "/addCart", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addProduct(@RequestBody CartItem cartItem) throws EcommerceException {
        try{
            cartDao.save(cartItem);
        }catch(RuntimeException exception){
            throw new EcommerceException(exception.getLocalizedMessage());
        }
    }

    @PostMapping(value = "/addAddress", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addAddress(@RequestBody Address address) throws EcommerceException {
        try{
            addressDao.save(address);
        }catch(RuntimeException exception){
            throw new EcommerceException(exception.getLocalizedMessage());
        }
    }

    @PostMapping(value = "/addOrder", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addOrder(@RequestBody OrderRequest orderRequest) throws EcommerceException {
        try{
            Order o = new Order();
            o.setAddressId(orderRequest.getAddressId());
            o.setCustomerId(orderRequest.getCustomerId());
            o.setPaymentId(orderRequest.getPaymentId());
            o.setPrice(orderRequest.getPrice());
            o.setStatusOrder("Complete");
            o.setTimeAdded(new Date());
            orderDao.save(o);
            //Delete the records related to the Customer from Cart
            cartDao.deleteByCustomerIdExcludingWishlist(o.getCustomerId());
        }catch(RuntimeException exception){
            throw new EcommerceException(exception.getLocalizedMessage());
        }
    }
}

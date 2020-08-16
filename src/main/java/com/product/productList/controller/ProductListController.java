package com.product.productList.controller;

import com.product.productList.dao.ProductDao;
import com.product.productList.model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductListController {

    @Autowired
    private ProductDao productDao;

    @GetMapping
    public List<ProductModel> getProductList(){
        return productDao.findAll();
    }

    @RequestMapping(value="/select", method = RequestMethod.GET)
    public @ResponseBody List<ProductModel> getProduct(@RequestParam("category") String categoryName) throws EcommerceException {
        try {
            return productDao.getProductBasedOnCategory(categoryName);
        }catch(RuntimeException exception){
            throw new EcommerceException(exception.getLocalizedMessage());
        }
    }

    @PostMapping(value = "/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addProduct(@RequestBody ProductModel productModel) throws EcommerceException {
        try{
            productDao.save(productModel);
        }catch(RuntimeException exception){
            throw new EcommerceException(exception.getLocalizedMessage());
        }

    }
}

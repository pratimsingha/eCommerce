package com.product.productList.dao;

import com.product.productList.model.Address;
import com.product.productList.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

}

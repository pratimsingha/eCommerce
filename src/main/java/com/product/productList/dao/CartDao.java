package com.product.productList.dao;

import com.product.productList.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface CartDao extends JpaRepository<CartItem, Integer> {
    @Transactional
    @Modifying
    @Query(value = "DELETE FROM CartItem a WHERE a.customerId = :customerId AND a.wishlist = 0")
    void deleteByCustomerIdExcludingWishlist(@Param("customerId") Integer customerId);
}

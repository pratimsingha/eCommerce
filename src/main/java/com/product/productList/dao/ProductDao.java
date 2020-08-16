package com.product.productList.dao;

import com.product.productList.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<ProductModel, Integer> {
    @Query(value = "SELECT a FROM ProductModel a INNER JOIN ProductCategory b on (a.productCategoryId = b.categoryId) where b.categoryName like %:categoryName% ")
    List<ProductModel> getProductBasedOnCategory(@Param("categoryName") String categoryName);
}

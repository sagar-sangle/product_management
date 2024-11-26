package com.nimapinfotech.product_cateogory_crud.repository;

import com.nimapinfotech.product_cateogory_crud.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

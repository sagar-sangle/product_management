package com.nimapinfotech.product_cateogory_crud.repository;

import com.nimapinfotech.product_cateogory_crud.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

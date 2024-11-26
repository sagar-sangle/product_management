package com.nimapinfotech.product_cateogory_crud.service;


import com.nimapinfotech.product_cateogory_crud.entity.Category;
import com.nimapinfotech.product_cateogory_crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    //get all categories
//    public List<Category> getAllCategories(){
//
//        return categoryRepository.findAll();
//
//    }

    //get all categories by paging
    public Page<Category> getAllCategories(Pageable pageable){

        return categoryRepository.findAll(pageable);
    }

    //create category
    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }

    //get category by id
    public Optional<Category> getCategoryById(Long id){

        return categoryRepository.findById(id);
    }


    //update category by Id
    public Category updateCategoryById(Long id,Category newCategoryDetails){
        return categoryRepository.findById(id)
                .map(category -> {
                    category.setName(newCategoryDetails.getName());
                    return categoryRepository.save(category);
                })
                .orElseThrow(() -> new RuntimeException("Category not found"));

    }

    //delete category by id
    public void DeleteCategoryById(Long id){
        categoryRepository.deleteById(id);
    }






}

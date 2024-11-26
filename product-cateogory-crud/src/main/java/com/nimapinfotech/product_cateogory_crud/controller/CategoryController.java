package com.nimapinfotech.product_cateogory_crud.controller;

import com.nimapinfotech.product_cateogory_crud.entity.Category;
import com.nimapinfotech.product_cateogory_crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;



    //get all
    @GetMapping("/categories")
    public List<Category> getAllCategories(){

        return categoryService.getAllCategories();
    }

    //create one
    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    //get category by Id
    @GetMapping("/categories/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id){
        return categoryService.getCategoryById(id);
    }

    @PutMapping("/categories/{id}")
    public Category updateCategoryById(@PathVariable Long id,@RequestBody Category updatedCategory){

        return categoryService.updateCategoryById(id,updatedCategory);
    }

    @DeleteMapping("/categories/{id}")
    public void deleteCategoryById(@PathVariable Long id){
        categoryService.DeleteCategoryById(id);
    }








}

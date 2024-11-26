package com.nimapinfotech.product_cateogory_crud.controller;

import com.nimapinfotech.product_cateogory_crud.entity.Category;
import com.nimapinfotech.product_cateogory_crud.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
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
    public Page<Category> getAllCategories(Pageable pageable){

        return categoryService.getAllCategories(pageable);
    }

    //create one
    @PostMapping("/categories")
    public Category createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    //get category by Id
    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){


         Category category = categoryService.getCategoryById(id).orElse(null);
         if(category!=null){
             return ResponseEntity.ok().body(category);
         }else {
             return ResponseEntity.notFound().build();
         }
    }

    @PutMapping("/categories/{id}")
    public ResponseEntity<Category> updateCategoryById(@PathVariable Long id,@RequestBody Category updatedCategory){


        Category cat = categoryService.getCategoryById(id).orElse(null);

        if(cat!=null){
            Category category= categoryService.updateCategoryById(id,updatedCategory);
            return ResponseEntity.ok().body(cat);
        }else {
            return ResponseEntity.notFound().build();
        }


    }

    @DeleteMapping("/categories/{id}")
    public ResponseEntity<Category> deleteCategoryById(@PathVariable Long id){
        Category cat = categoryService.getCategoryById(id).orElse(null);
        if(cat!=null){
            categoryService.DeleteCategoryById(id);
            return ResponseEntity.ok().body(cat);

        }else {
            return ResponseEntity.notFound().build();
        }


    }








}

package com.nimapinfotech.product_cateogory_crud.controller;

import com.nimapinfotech.product_cateogory_crud.entity.Product;
import com.nimapinfotech.product_cateogory_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Page<Product> getAllProducts(Pageable pageable) {
        return productService.getAllProducts(pageable);
    }

    //get all prodcuts
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }


    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
         Product product = productService.getProductById(id).orElse(null);
         if (product!=null){
             return ResponseEntity.ok().body(product);
         }
         else {
             return ResponseEntity.notFound().build();
         }
    }

    @PutMapping("products/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable Long id,@RequestBody Product updatedProduct){
        Product product = productService.getProductById(id).orElse(null);
        if (product!=null){
            Product newproduct= productService.updateProductById(id,updatedProduct);
            return ResponseEntity.ok().body(newproduct);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Product> deleteProductById(@PathVariable Long id){
        Product product = productService.getProductById(id).orElse(null);
        if (product!=null){
            productService.deleteProductById(id);

            return ResponseEntity.ok().body(product);
        }
        else {
            return ResponseEntity.notFound().build();
        }

    }

}

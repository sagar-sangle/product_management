package com.nimapinfotech.product_cateogory_crud.controller;

import com.nimapinfotech.product_cateogory_crud.entity.Product;
import com.nimapinfotech.product_cateogory_crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("products/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("products/{id}")
    public Product updateProductById(@PathVariable Long id,@RequestBody Product updatedProduct){
        return productService.updateProductById(id,updatedProduct);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id){
        productService.deleteProductById(id);
    }

}

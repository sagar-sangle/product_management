package com.nimapinfotech.product_cateogory_crud.service;

import com.nimapinfotech.product_cateogory_crud.entity.Product;
import com.nimapinfotech.product_cateogory_crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }


    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    //update prodcuct by id
    public Product updateProductById(Long id,Product newProduct){
     return  productRepository.findById(id).map(product -> {
            product.setPrice(newProduct.getPrice());
            product.setName(newProduct.getName());
            if(newProduct.getCategory()!=null){
            product.setCategory(newProduct.getCategory());
            }
             return productRepository.save(product);
         }).orElseThrow(() -> new RuntimeException("Product Not found"));

    }

    //delete single product
    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }
}

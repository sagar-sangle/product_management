package com.nimapinfotech.product_cateogory_crud;

import com.nimapinfotech.product_cateogory_crud.entity.Category;
import com.nimapinfotech.product_cateogory_crud.entity.Product;
import com.nimapinfotech.product_cateogory_crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ProductCateogoryCrudApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProductCateogoryCrudApplication.class, args);





	}

	@Override
	public void run(String... args) throws Exception {
        System.out.println("applicaton started");

	}
}

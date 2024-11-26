package com.nimapinfotech.product_cateogory_crud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private Long price;

    @Column(nullable = false,unique = true)
    private String name;


    @ManyToOne
    @JoinColumn(name = "product_category")
    private Category category;

    public Product() {
    }

    public Product(long id, String name, Category category,Long price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price=price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}

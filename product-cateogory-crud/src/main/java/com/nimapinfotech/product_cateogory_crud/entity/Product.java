package com.nimapinfotech.product_cateogory_crud.entity;

import jakarta.persistence.*;

@Entity
@Table
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false,unique = true)
    private String name;


    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(long id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}

package com.programming.uit.springbootpet.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(length = 128, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "category")
    List<Product> products;

    public Category(Long categoryId, String name, List<Product> products) {
        this.categoryId = categoryId;
        this.name = name;
        this.products = products;
    }
    public Category( String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }
// sảy ra trong 1 class , khác kiểu là param chuyen vao la ok


}

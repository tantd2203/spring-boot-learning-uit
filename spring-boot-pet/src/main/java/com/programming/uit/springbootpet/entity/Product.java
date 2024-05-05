package com.programming.uit.springbootpet.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Column(unique = true, length = 256, nullable = false)
    private String name;


    @Column(length = 512, nullable = false, name = "short_description")
    private String shortDescription;


    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "updated_time")
    private Date updatedTime;

    private boolean enabled;

    @Column(name = "in_stock")
    private boolean inStock;

    private float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

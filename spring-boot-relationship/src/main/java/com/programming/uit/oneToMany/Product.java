package com.programming.uit.oneToMany;

import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String nameProduct;
    @ManyToOne
    @JoinColumn(name = "category_id") // thông qua khóa ngoại category_id
    private Category category;

}

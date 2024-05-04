package com.programming.uit.oneToOne;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Person {
    @Id // Đánh dấu trường này là primary key
    @GeneratedValue // Tự động tăng giá trị id
    private Long id;
    private String name;

}

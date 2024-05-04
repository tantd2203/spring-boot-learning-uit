package com.programming.uit.oneToOne;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Address { // Table address
    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String province;

    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với Person ở phía dưới
    @JoinColumn(name = "person_id") // Liên kết với nhau qua khóa ngoại person_id
    private Person person;
}


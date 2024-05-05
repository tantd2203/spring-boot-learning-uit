package com.programming.uit.springbootpet.repository;

import com.programming.uit.springbootpet.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public Product findByName(String name);

    @Query("UPDATE Product p SET p.enabled = ?2 where p.productId=?1")
    @Modifying
    public void updateEnabledStatus(Long id, boolean enable);

    @Query("SELECT p FROM Product p ")
    public List<Product> listProductInStock(Pageable pageable);


    @Query("SELECT p FROM Product p WHERE p.name LIKE %?1%")
    public Page<Product> searchProductsByName(String keyword, Pageable pageable);

}

package com.programming.uit.springbootpet.service;

import com.programming.uit.springbootpet.entity.Product;
import com.programming.uit.springbootpet.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAllProductInSock() {
        List<Product> products = productRepository.findAll();
        return productRepository.findAll();
    }


}

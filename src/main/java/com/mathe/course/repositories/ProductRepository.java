package com.mathe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathe.course.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
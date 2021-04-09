package com.mathe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathe.course.entity.Category;
import com.mathe.course.entity.Order;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

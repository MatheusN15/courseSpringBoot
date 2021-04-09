package com.mathe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathe.course.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

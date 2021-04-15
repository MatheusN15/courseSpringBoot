package com.mathe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathe.course.entity.OrderItem;
import com.mathe.course.entity.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}

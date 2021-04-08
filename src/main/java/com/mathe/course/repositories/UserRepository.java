package com.mathe.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mathe.course.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}

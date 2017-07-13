package com.xh.frame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xh.frame.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}

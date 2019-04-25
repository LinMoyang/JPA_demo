package com.xiaolinzi.demodatajpa.repository;

import com.xiaolinzi.demodatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface UserRepository extends JpaRepository<User,Integer> {//主键的类型
}

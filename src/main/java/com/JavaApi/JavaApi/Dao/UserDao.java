package com.JavaApi.JavaApi.Dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaApi.JavaApi.entities.User;


public interface UserDao extends JpaRepository<User,Long> {

}

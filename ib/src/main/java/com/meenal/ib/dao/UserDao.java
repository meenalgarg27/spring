package com.meenal.ib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenal.ib.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}

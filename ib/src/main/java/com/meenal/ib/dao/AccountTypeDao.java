package com.meenal.ib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenal.ib.entities.AccountType;

@Repository
public interface AccountTypeDao extends JpaRepository<AccountType, Long>{

}

package com.meenal.ib.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meenal.ib.entities.GovernmentIds;

@Repository
public interface GovernmentIdDao extends JpaRepository<GovernmentIds, Long>{

}
package com.meenal.ib.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meenal.ib.entities.ProcessEntity;

public interface ProcessDao extends JpaRepository<ProcessEntity, Long> {

}

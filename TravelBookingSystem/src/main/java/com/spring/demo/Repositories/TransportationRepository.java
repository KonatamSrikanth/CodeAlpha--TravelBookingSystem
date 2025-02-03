package com.spring.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.TransportationEntity.Transportation;

@Repository
public interface TransportationRepository extends JpaRepository<Transportation,String>{

}

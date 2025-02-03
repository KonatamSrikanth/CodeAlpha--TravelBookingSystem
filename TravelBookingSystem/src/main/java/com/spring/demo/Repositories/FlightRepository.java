package com.spring.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.FlightEntity.Flight;

@Repository
public interface FlightRepository extends JpaRepository <Flight,String> {

}

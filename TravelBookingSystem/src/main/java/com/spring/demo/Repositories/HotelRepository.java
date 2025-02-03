package com.spring.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.HotelEntity.Hotel;

@Repository

public interface HotelRepository extends JpaRepository <Hotel , String>{

}

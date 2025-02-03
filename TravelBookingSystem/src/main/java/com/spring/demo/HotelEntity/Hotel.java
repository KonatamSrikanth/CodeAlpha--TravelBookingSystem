package com.spring.demo.HotelEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hotel")
public class Hotel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;
	public String location;
	public Double pricePerNight;
	public int availableRooms;
	
	
	public Hotel() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Double getPricePerNight() {
		return pricePerNight;
	}


	public void setPricePerNight(Double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}


	public int getAvailableRooms() {
		return availableRooms;
	}


	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	
	

}

package com.spring.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.BookingServices.BookingService;
import com.spring.demo.FlightEntity.Flight;
import com.spring.demo.HotelEntity.Hotel;
import com.spring.demo.TransportationEntity.Transportation;

@RestController
public class BookingController {
	
	 @Autowired
	    private BookingService bookingService;

	    // Get all flights
	    @GetMapping("/allflights")
	    public List<Flight> getAllFlights() {
	        return bookingService.getAllFlights();
	    }
	    

	    // Get all hotels
	    @GetMapping("/allhotels")
	    public List<Hotel> getAllHotels() {
	        return bookingService.getAllHotels();
	    }

	    // Get all transportation options
	    @GetMapping("/alltransportation")
	    public List<Transportation> getAllTransportation() {
	        return bookingService.getAllTransportation();
	    }

	    // Book a flight by flight number
	    @PostMapping("/book-flight/{flightNumber}")
	    public Flight bookFlight(@PathVariable String flightNumber) {
	        return bookingService.bookFlight(flightNumber);
	    }

	    // Book a hotel by hotel name
	    @PostMapping("/book-hotel/{hotelName}")
	    public Hotel bookHotel(@PathVariable String hotelName) {
	        return bookingService.bookHotel(hotelName);
	    }

	    // Book transportation by type
	    @PostMapping("/book-transportation/{type}")
	    public Transportation bookTransportation(@PathVariable String type) {
	        return bookingService.bookTransportation(type);
	    }
	}



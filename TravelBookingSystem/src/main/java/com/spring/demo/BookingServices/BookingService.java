package com.spring.demo.BookingServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.FlightEntity.Flight;
import com.spring.demo.HotelEntity.Hotel;
import com.spring.demo.Repositories.FlightRepository;
import com.spring.demo.Repositories.HotelRepository;
import com.spring.demo.Repositories.TransportationRepository;
import com.spring.demo.TransportationEntity.Transportation;

@Service
public class BookingService {


    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private TransportationRepository transportationRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public List<Transportation> getAllTransportation() {
        return transportationRepository.findAll();
    }

    public Flight bookFlight(String flightNumber) {
        return flightRepository.findById(flightNumber).orElse(null);
    }

    public Hotel bookHotel(String hotelName) {
        return hotelRepository.findById(hotelName).orElse(null);
    }

    public Transportation bookTransportation(String type) {
        return transportationRepository.findById(type).orElse(null);
    }
}


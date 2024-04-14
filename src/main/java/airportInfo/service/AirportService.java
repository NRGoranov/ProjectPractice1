package com.example.airportinfo.service;

import com.example.airportinfo.model.Airport;
import com.example.airportinfo.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportService {

    @Autowired
    private AirportRepository airportRepository;

    public List<Airport> findAllAirports() {
        return airportRepository.findAll();
    }

    public List<Airport> filterAirports(AirportFilter filter, boolean countryAsRoot) {
        return List.of();
    }
}

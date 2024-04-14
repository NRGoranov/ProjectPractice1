package com.example.airportinfo.controller;

import com.example.airportinfo.model.Airport;
import com.example.airportinfo.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.findAllAirports();
    }

    @PostMapping("/filter")
    public List<Airport> filterAirports(@RequestBody AirportFilter filter,
                                        @RequestParam boolean countryAsRoot) {
        return airportService.filterAirports(filter, countryAsRoot);
    }
}

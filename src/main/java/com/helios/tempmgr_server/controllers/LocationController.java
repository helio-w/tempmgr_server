package com.helios.tempmgr_server.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helios.tempmgr_server.entities.Location;
import com.helios.tempmgr_server.exceptions.*;
import com.helios.tempmgr_server.repositories.LocationRepository;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
public class LocationController {
	private final LocationRepository locationRepository;
	
	
	public LocationController(LocationRepository locationrepository) {
		this.locationRepository = locationrepository;
	}
	
	@GetMapping
	public List<Location> getAllLocations(){
		return locationRepository.findAll();
	}
	
	
	@GetMapping("/{id}")
	public Location getLocation(@PathVariable Long id) {
		return this.locationRepository.findById(id).orElseThrow(() -> new LocationNotFoundException(id));
	}
	
	@PostMapping
    public Location addLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }
	
	@DeleteMapping("/{id}")
	void deleteLocation(@PathVariable Long id) {
		this.locationRepository.deleteById(id);
	}
}

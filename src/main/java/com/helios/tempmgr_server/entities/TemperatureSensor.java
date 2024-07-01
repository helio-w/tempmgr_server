package com.helios.tempmgr_server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TemperatureSensor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	public String familiarName;
	@ManyToOne
    @JoinColumn(name = "location_id")
	public Location location;
	
	public TemperatureSensor(String fn, Location loc) {
		this.familiarName = fn;
		this.location = loc;
	}

	public TemperatureSensor() {

	}
}

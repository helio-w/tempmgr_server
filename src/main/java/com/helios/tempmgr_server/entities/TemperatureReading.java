package com.helios.tempmgr_server.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class TemperatureReading {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	public TemperatureSensor sensor;
	public double temperature;
	public LocalDateTime timestamp;
	
	public TemperatureReading(TemperatureSensor sensor, double temp) {
		this.sensor = sensor;
		this.temperature = temp;
		this.timestamp = LocalDateTime.now();
	}

	public TemperatureReading() {

	}
}

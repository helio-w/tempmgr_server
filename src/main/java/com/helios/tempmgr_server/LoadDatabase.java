package com.helios.tempmgr_server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.helios.tempmgr_server.entities.*;
import com.helios.tempmgr_server.repositories.*;

@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
	
  @Bean
  CommandLineRunner initDatabase(LocationRepository repository) {

    return args -> {
      log.info("Preloading " + repository.save(new Location("Salle de bain")));
      log.info("Preloading " + repository.save(new Location("Chambre")));
    };
  }
}

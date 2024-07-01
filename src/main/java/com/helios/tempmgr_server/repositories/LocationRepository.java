package com.helios.tempmgr_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.helios.tempmgr_server.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
}
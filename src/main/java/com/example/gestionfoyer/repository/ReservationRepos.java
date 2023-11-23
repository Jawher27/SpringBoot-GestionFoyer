package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepos extends CrudRepository<Reservation, String> {
}

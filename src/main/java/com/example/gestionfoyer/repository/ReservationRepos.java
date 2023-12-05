package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface ReservationRepos extends CrudRepository<Reservation, String> {



    boolean existsByEtudiantsCinAndAnneeUniversitaireBetween(long etudiants_cin, LocalDate anneeUniversitaire, LocalDate anneeUniversitaire2);

}

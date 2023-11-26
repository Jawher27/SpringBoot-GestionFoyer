package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EtudiantRepos extends CrudRepository<Etudiant,Long> {

    Optional<Etudiant> findByCin(long cin);
}

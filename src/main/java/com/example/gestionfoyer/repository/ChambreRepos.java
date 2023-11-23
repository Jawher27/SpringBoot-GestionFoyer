package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Chambre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChambreRepos extends CrudRepository<Chambre, Long> {
}

package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepos extends CrudRepository<Foyer, Long> {
}

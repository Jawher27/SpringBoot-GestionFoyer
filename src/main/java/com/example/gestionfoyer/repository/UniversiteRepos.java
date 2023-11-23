package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Universite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversiteRepos extends CrudRepository<Universite, Long> {
}

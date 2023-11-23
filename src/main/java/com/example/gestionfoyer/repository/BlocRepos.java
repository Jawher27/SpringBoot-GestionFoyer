package com.example.gestionfoyer.repository;

import com.example.gestionfoyer.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlocRepos extends CrudRepository<Bloc, Long> {
}

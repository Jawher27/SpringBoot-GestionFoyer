package com.example.gestionfoyer.services;


import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.repository.UniversiteRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImp implements UniversiteService{

    private final UniversiteRepos universiteRepos;

    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepos.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepos.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepos.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepos.findById(idUniversite).orElse(null);
    }
}

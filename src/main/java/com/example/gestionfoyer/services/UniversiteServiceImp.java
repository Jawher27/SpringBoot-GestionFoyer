package com.example.gestionfoyer.services;


import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.repository.FoyerRepos;
import com.example.gestionfoyer.repository.UniversiteRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImp implements UniversiteService{

    private final UniversiteRepos universiteRepos;
    private  final FoyerRepos foyerRepos ;

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

    @Override
    public Universite affecterFoyerAUniversite(long idFoyer, String nomUniversite) {

        Universite universite = universiteRepos.findByNomUniversite(nomUniversite);
        Foyer foyer = foyerRepos.findById(idFoyer).orElse(null);


        universite.setFoyer(foyer);

        universiteRepos.save(universite);

        return universite ;

    }

    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {

        Universite universite = universiteRepos.findById(idUniversite).orElse(null);
        universite.setFoyer(null);

        universiteRepos.save(universite);
        return universite;
    }
}

package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Universite;

import java.util.List;

public interface UniversiteService {

    List<Universite> retrieveAllUniversities();

    Universite addUniversite (Universite u);

    Universite updateUniversite (Universite u);

    Universite retrieveUniversite (long idUniversite);
    public Universite affecterFoyerAUniversite (long idFoyer, String nomUniversite);

    public Universite desaffecterFoyerAUniversite (long idUniversite) ;
}

package com.example.gestionfoyer.services;


import com.example.gestionfoyer.entities.Universite;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteServiceImp implements UniversiteService{
    @Override
    public List<Universite> retrieveAllUniversities() {
        return null;
    }

    @Override
    public Universite addUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return null;
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return null;
    }
}

package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.repository.ChambreRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceImp implements ChambreService{

    private final ChambreRepos chambreRepos;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return (List<Chambre>) chambreRepos.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepos.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepos.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepos.findById(idChambre).orElse(null);
    }
}

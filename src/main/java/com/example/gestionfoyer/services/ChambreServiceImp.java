package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Chambre;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreServiceImp implements ChambreService{
    @Override
    public List<Chambre> retrieveAllChambres() {
        return null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return null;
    }
}

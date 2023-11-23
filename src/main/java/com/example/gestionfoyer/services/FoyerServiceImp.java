package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Foyer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerServiceImp implements FoyerService {

    @Override
    public List<Foyer> retrieveAllFoyers() {
        return null;
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return null;
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return null;
    }

    @Override
    public void removeFoyer(long idFoyer) {

    }
}

package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.repository.FoyerRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerServiceImp implements FoyerService {


    private final FoyerRepos foyerRepos;
    @Override
    public List<Foyer> retrieveAllFoyers() {
        return (List<Foyer>) foyerRepos.findAll();
    }

    @Override
    public Foyer addFoyer(Foyer f) {
        return foyerRepos.save(f);
    }

    @Override
    public Foyer updateFoyer(Foyer f) {
        return foyerRepos.save(f);
    }

    @Override
    public Foyer retrieveFoyer(long idFoyer) {
        return foyerRepos.findById(idFoyer).orElse(null);
    }

    @Override
    public void removeFoyer(long idFoyer) {

        foyerRepos.deleteById(idFoyer);

    }
}

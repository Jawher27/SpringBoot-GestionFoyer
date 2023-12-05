package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.repository.BlocRepos;
import com.example.gestionfoyer.repository.FoyerRepos;
import com.example.gestionfoyer.repository.UniversiteRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerServiceImp implements FoyerService {


    private final FoyerRepos foyerRepos;
    private final UniversiteRepos universiteRepos;
    private final BlocRepos blocRepos;
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

    @Override
    public Foyer ajouterFoyerEtAffecterAUniversite(Foyer foyer, long idUniversite) {

        Universite universite = universiteRepos.findById(idUniversite).orElse(null);
       universite.setFoyer(foyer);


      //  Bloc b = new Bloc();
        foyer.getBlocs().forEach(bloc ->{ Bloc b = blocRepos.findById(bloc.getIdBloc()).orElse(null);

    // List<Bloc> blocs = new ArrayList<>();
     if (b != null){
    //  blocs.add(b);
      b.setFoyer(foyer);
     }
     // foyer.setBlocs(blocs);
        });



        return foyerRepos.save(foyer);
    }
}

package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.repository.BlocRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocServiceImp implements BlocService{

  private final BlocRepos blocRepos;
    @Override
    public List<Bloc> retrieveBlocs() {
        return (List<Bloc>) blocRepos.findAll() ;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepos.save(bloc);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepos.save(bloc);
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return blocRepos.findById(idBloc).orElse(null);
    }

    @Override
    public void removeBloc(long idBloc) {

      blocRepos.deleteById(idBloc);

    }
}

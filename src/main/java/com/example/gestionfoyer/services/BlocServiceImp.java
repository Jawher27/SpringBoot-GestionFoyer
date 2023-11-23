package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Bloc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlocServiceImp implements BlocService{


    @Override
    public List<Bloc> retrieveBlocs() {
        return null;
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return null;
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return null;
    }

    @Override
    public Bloc retrieveBloc(long idBloc) {
        return null;
    }

    @Override
    public void removeBloc(long idBloc) {

    }
}

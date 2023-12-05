package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.repository.BlocRepos;
import com.example.gestionfoyer.repository.ChambreRepos;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.*;

@Service
@RequiredArgsConstructor
public class BlocServiceImp implements BlocService{

  private final BlocRepos blocRepos;
  private  final ChambreRepos chambreRepos;
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

@Transactional
  @Override
  public Bloc affecterChambresABloc(List<Long> numChambre, long idBloc) {

    Bloc bloc = blocRepos.findById(idBloc).orElseThrow(
            () -> new IllegalArgumentException("Le bloc n'existe pas"));

       numChambre.forEach(num -> { Chambre chambre = chambreRepos.findByNumeroChambre(num) ;



         if (chambre !=null) {
         //   chambres.add(chambre);
          chambre.setBloc(bloc);

         }

       });















   /*   Bloc bloc = blocRepos.findById(idBloc).orElseThrow(
      () -> new IllegalArgumentException("Le bloc n'existe pas"));
      //List<Long>numChambreList = new ArrayList<Long>();

      List<Chambre>chambres = new ArrayList<Chambre>();

     numChambre.forEach(numchambre -> {
       Chambre c = new Chambre();
       c = this.chambreRepos.findByNumeroChambre(numchambre);
       if (c != null) {
         chambres.add( c );

       }
     });

        bloc.getChambres().addAll(chambres);
        this.blocRepos.save(bloc);
        bloc.getChambres().forEach(c -> System.out.println(c.toString()));*/




    return  bloc;



  }
}

package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Bloc;
import com.example.gestionfoyer.services.BlocService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bloc")
public class BlocController {

    private final BlocService blocService;

    @GetMapping
   public List<Bloc> retrieveBlocs() {

       return blocService.retrieveBlocs();

   }


   @PutMapping
   public  Bloc updateBloc(@RequestBody Bloc bloc){

        return blocService.updateBloc(bloc);
   }


   @PostMapping
   public Bloc addBloc(@RequestBody Bloc bloc) {

        return blocService.addBloc(bloc);
   }


   @GetMapping("{idBloc}")
   public Bloc retrieveBloc(@PathVariable long idBloc){

        return blocService.retrieveBloc(idBloc);

   }

   @DeleteMapping("{idBloc}")
   public boolean removeBloc(@PathVariable long idBloc ) {

        blocService.removeBloc(idBloc);
        return true;
   }





}

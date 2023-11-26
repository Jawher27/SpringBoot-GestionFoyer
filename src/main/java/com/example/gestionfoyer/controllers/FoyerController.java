package com.example.gestionfoyer.controllers;


import com.example.gestionfoyer.entities.Foyer;
import com.example.gestionfoyer.services.FoyerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {

   private final FoyerService foyerService;

   @GetMapping
    public List<Foyer> retrieveAllFoyers(){

       return foyerService.retrieveAllFoyers();
    }

    @PostMapping
    Foyer addFoyer(@RequestBody Foyer f){

        return foyerService.addFoyer(f);
    }


    @PutMapping
    public Foyer updateFoyer(@RequestBody Foyer f){
        return foyerService.updateFoyer(f);
    }


    @GetMapping("{idFoyer}")
    public Foyer retrieveFoyer(@PathVariable long idFoyer){

        return foyerService.retrieveFoyer(idFoyer);
    }

    @DeleteMapping("{idFoyer}")
    public boolean removeFoyer(@PathVariable long idFoyer){

        foyerService.removeFoyer(idFoyer);
        return true;

    }






}

package com.example.gestionfoyer.controllers;


import com.example.gestionfoyer.entities.Universite;
import com.example.gestionfoyer.services.UniversiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {

    private final UniversiteService universiteService;


    @GetMapping
    public List<Universite> retrieveAllUniversities(){

        return universiteService.retrieveAllUniversities();
    }

    @PostMapping
    public Universite addUniversite(@RequestBody Universite u){

        return universiteService.addUniversite(u);

    }

    @PutMapping
    public Universite updateUniversite(@RequestBody Universite u){

        return universiteService.updateUniversite(u);
    }


    @GetMapping("{idUniversite}")
    public Universite retrieveUniversite(@PathVariable long idUniversite){

        return universiteService.retrieveUniversite(idUniversite);
    }

}

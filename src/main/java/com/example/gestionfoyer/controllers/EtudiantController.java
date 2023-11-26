package com.example.gestionfoyer.controllers;


import com.example.gestionfoyer.entities.Etudiant;
import com.example.gestionfoyer.services.EtudiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {

    private final EtudiantService etudiantService;

    @GetMapping
    public List<Etudiant> retrieveAllEtudiants(){

        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping
    public List<Etudiant> addEtudiants(@RequestBody List<Etudiant> etudiants){

        return etudiantService.addEtudiants(etudiants);
    }

    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant e){

        return etudiantService.updateEtudiant(e);
    }

    @GetMapping("{idEtudiant}")
    public Etudiant retrieveEtudiant(@PathVariable long idEtudiant){

        return etudiantService.retrieveEtudiant(idEtudiant);
    }

    @DeleteMapping("{idEtudiant}")
    public boolean removeEtudiant(@PathVariable long idEtudiant){

        etudiantService.removeEtudiant(idEtudiant);
        return true;
    }




}

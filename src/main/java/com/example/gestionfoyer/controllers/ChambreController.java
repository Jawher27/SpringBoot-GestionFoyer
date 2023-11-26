package com.example.gestionfoyer.controllers;


import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.services.ChambreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    private final ChambreService chambreService;

    @GetMapping
    public List<Chambre> retrieveAllChambres() {

      return chambreService.retrieveAllChambres();

    }
    @PostMapping
    public Chambre addChambre(@RequestBody Chambre c){

     return chambreService.addChambre(c);
    }
    @PutMapping
    public Chambre updateChambre(@RequestBody Chambre c){

     return chambreService.updateChambre(c);
    }
   @GetMapping("{idChambre}")
    public Chambre retrieveChambre(@PathVariable long idChambre){

        return chambreService.retrieveChambre(idChambre);
    }

}

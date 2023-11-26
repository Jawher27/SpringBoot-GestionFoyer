package com.example.gestionfoyer.controllers;

import com.example.gestionfoyer.entities.Reservation;
import com.example.gestionfoyer.services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private final ReservationService reservationService;


    @GetMapping
    public List<Reservation> retrieveAllReservation(){

        return reservationService.retrieveAllReservation();
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody Reservation res){

        return reservationService.updateReservation(res);
    }

    @GetMapping("{idResrvation}")
    public Reservation retrieveReservation(@PathVariable String idReservation){

        return reservationService.retrieveReservation(idReservation);
    }






}

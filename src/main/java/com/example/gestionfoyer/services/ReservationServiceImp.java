package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Etudiant;
import com.example.gestionfoyer.entities.Reservation;
import com.example.gestionfoyer.repository.ReservationRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImp implements ReservationService{

    private final ReservationRepos reservationRepos;
    @Override
    public List<Reservation> retrieveAllReservation() {
        return (List<Reservation>) reservationRepos.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return reservationRepos.save(res);
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return reservationRepos.findById(idReservation).orElse(null);
    }





 /*public Reservation ajouterReservation2(long idChambre, long cinEtudiant)
 {

     Etudiant etudiant = etudiantRepos.findByCin(cinEtudiant).orElseThrow-> ;
     Chambre chambre = chambreRepos.findById(idChambre).or
 }*/

}

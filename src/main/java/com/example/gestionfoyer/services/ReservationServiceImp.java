package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Chambre;
import com.example.gestionfoyer.entities.Etudiant;
import com.example.gestionfoyer.entities.Reservation;
import com.example.gestionfoyer.repository.ChambreRepos;
import com.example.gestionfoyer.repository.EtudiantRepos;
import com.example.gestionfoyer.repository.ReservationRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImp implements ReservationService{

    private final ReservationRepos reservationRepos;
    private final ChambreRepos chambreRepos;
    private  final EtudiantRepos etudiantRepos;
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

    @Override
    public Reservation ajouterReservation(long idChambre, long cinEtudiant) {
        Etudiant etudiant = etudiantRepos.findByCin(cinEtudiant).orElseThrow(() -> new IllegalArgumentException("L'etudiant n'existe pas"));

        //il faut que l'etudiant ne dispose pas de res au cours de l'année courante
        Assert.isTrue(!reservationRepos.existsByEtudiantsCinAndAnneeUniversitaireBetween(cinEtudiant
                        , LocalDate.of(LocalDate.now().getYear(),1,1)
                        ,LocalDate.of(LocalDate.now().getYear(),12,31))
                ,"l'etudiant dispose deja d'une reservation");

        Chambre chambre = chambreRepos.findById(idChambre).orElseThrow(() -> new IllegalArgumentException("chambre n'existe pas"));

        String id=chambre.getNumeroChambre()+'-'+chambre.getBloc().getNomBloc()+'-'+LocalDate.now().getYear();
        Reservation reservation =reservationRepos.findById(id)
                .orElse(
                        Reservation.builder()
                                .idReservation(id)
                                .anneeUniversitaire(LocalDate.now())
                                .etudiants(new ArrayList<>())
                                .estValide(true)
                                .build());


        //si la reservation n'est pas valide , il va lancer une exception
        Assert.isTrue(reservation.isEstValide(),"la chambre est saturée");
        //si la reservation est valide , on va ajouter l'etudiant au set des Etudiants dans reservation
        reservation.getEtudiants().add(etudiant);

        //si la reservation est nouvelle
        if(!chambre.getReservationss().contains(reservation))
        {
            //enregistrer la nouvelle reservation et l'affecter à l'ancienne reservation(bch twali l'objet reservation managed entity et les modifications d'après s'effectueront à travers transactional)
            //--->recuperer le retour de .save w nraj3ou f l'objet reservation eli nekhdem alih
            reservation=reservationRepos.save(reservation);
            //l'ajouter au set des reservations au niveau de la chambre
            chambre.getReservationss().add(reservation);
        }
        //on va modifier l'attribut isValid selon le type de la chambre et size du set Etudiant
        switch (chambre.getTypeC())
        {
            case SIMPLE -> reservation.setEstValide(false);
            case DOUBLE -> {if (reservation.getEtudiants().size()==2) {reservation.setEstValide(false);}}
            case TRIPLE -> {if (reservation.getEtudiants().size()==3) {reservation.setEstValide(false);}}
        }
        return reservation;
    }





 /*public Reservation ajouterReservation2(long idChambre, long cinEtudiant)
 {

     Etudiant etudiant = etudiantRepos.findByCin(cinEtudiant).orElseThrow-> ;
     Chambre chambre = chambreRepos.findById(idChambre).or
 }*/

}

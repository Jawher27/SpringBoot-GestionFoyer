package com.example.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class Reservation {


    @Id
    //@Setter(AccessLevel.NONE)
    String idReservation;
    @Temporal(TemporalType.DATE)
    LocalDate anneeUniversitaire;
    boolean estValide;

    @ManyToMany
    List<Etudiant> etudiants;
}
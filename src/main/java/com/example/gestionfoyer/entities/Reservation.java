package com.example.gestionfoyer.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {


    @Id
    //@Setter(AccessLevel.NONE)
    String idReservation;
    @Temporal(TemporalType.DATE)
    Date anneeUniversitaire;
    boolean estValide;

    @ManyToMany
    Set<Etudiant> etudiantSet;
}
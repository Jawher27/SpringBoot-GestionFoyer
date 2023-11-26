package com.example.gestionfoyer.entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idEtudiant;
     String nomEt;
     String prenomEt;
     long cin;
     String ecole;
     @Temporal(TemporalType.DATE)
     Date dateNaissance;

     @ManyToMany(mappedBy = "etudiants")
     List<Reservation> reservations;


}

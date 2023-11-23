package com.example.gestionfoyer.entities;


import com.example.gestionfoyer.entities.enums.TypeChambre;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idChambre;
     long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeC;

    @ManyToOne
     Bloc bloc;

   @OneToMany
    Set<Reservation> reservationSet;
}

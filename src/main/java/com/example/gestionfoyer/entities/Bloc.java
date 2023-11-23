package com.example.gestionfoyer.entities;

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
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idBloc;
     String nomBloc;
     long capaciteBloc;

     @ManyToOne
      Foyer foyer;

     @OneToMany(mappedBy = "bloc")
      Set<Chambre> chambreSet;





}

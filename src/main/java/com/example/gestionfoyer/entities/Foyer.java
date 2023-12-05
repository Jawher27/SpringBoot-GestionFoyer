package com.example.gestionfoyer.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
     long idFoyer;
     String nomFoyer;
     long capaciteFoyer;

     @OneToOne(mappedBy = "foyer")

      Universite universite;

     @OneToMany(mappedBy = "foyer")
     List<Bloc> blocs;
}

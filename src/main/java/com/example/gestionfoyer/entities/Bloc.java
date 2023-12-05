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
     @JsonIgnore
     List<Chambre> chambres;





}

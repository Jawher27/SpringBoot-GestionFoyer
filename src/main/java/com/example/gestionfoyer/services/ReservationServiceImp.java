package com.example.gestionfoyer.services;

import com.example.gestionfoyer.entities.Reservation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImp implements ReservationService{
    @Override
    public List<Reservation> retrieveAllReservation() {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation res) {
        return null;
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }
}

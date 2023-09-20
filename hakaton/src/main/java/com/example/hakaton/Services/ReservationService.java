package com.example.hakaton.Services;

import com.example.hakaton.Objects.Reservation;
import com.example.hakaton.Repositories.ReservationRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<?> getAllReservations(){
        List<Reservation> reservations = reservationRepository.findAll();
        return reservations;
    }

    public void createNewReservation(Reservation reservation){
        reservationRepository.save(reservation);
        log.info("Saving new reservation : Id {}", reservation.getId());
    }
}

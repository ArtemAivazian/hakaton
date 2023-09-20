package com.example.hakaton.Services;

import com.example.hakaton.Objects.Reservation;
import com.example.hakaton.Repositories.ReservationRepository;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@Slf4j
public class ReservationService {

    private ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations(){
        return reservationRepository.findAll();
    }

    public void createNewReservation(Reservation reservation){
        reservationRepository.save(reservation);
        log.info("Saving new reservation : Id {}", reservation.getId());
    }
}

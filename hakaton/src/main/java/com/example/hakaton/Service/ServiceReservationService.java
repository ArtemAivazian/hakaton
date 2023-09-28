package com.example.hakaton.Service;

import com.example.hakaton.Entity.ServiceReservation;
import com.example.hakaton.DataAccess.ServiceReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j //for logging
public class ServiceReservationService {
    private final ServiceReservationRepository reservationRepository;

    @Autowired
    public ServiceReservationService(ServiceReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void createNewReservation(ServiceReservation reservation){
        reservationRepository.save(reservation);
        log.info("Saving new reservation : Id {}", reservation.getId());
    }
}

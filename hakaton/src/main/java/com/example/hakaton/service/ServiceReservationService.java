package com.example.hakaton.service;

import com.example.hakaton.entity.ServiceReservation;
import com.example.hakaton.DAO.ServiceReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j //for logging
public class ServiceReservationService {
    private final ServiceReservationRepository reservationRepository;

    public ServiceReservationService(ServiceReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public void createNewReservation(ServiceReservation reservation){
        reservationRepository.save(reservation);
        log.info("Saving new reservation : Id {}", reservation.getId());
    }
}

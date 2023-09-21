package com.example.hakaton.Services;

import com.example.hakaton.Objects.ServiceReservation;
import com.example.hakaton.Repositories.ServiceReservationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceReservationService {

    @Autowired
    private ServiceReservationRepository reservationRepository;

    public List<?> getAllReservations(){
        List<ServiceReservation> reservations = reservationRepository.findAll();
        return reservations;
    }

    public void createNewReservation(ServiceReservation reservation){
        reservationRepository.save(reservation);
        log.info("Saving new reservation : Id {}", reservation.getId());
    }
}

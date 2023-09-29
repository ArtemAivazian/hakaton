package com.example.hakaton.API;


import com.example.hakaton.entity.ServiceReservation;
import com.example.hakaton.service.ServiceReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class ServiceReservationController {

    private final ServiceReservationService reservationService;

    public ServiceReservationController(ServiceReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public String createServiceReservation(@RequestBody ServiceReservation reservation){
        reservationService.createNewReservation(reservation);
        return "New reservation is added";
    }

}

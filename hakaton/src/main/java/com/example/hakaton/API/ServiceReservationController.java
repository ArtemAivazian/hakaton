package com.example.hakaton.API;


import com.example.hakaton.Entity.ServiceReservation;
import com.example.hakaton.Service.ServiceReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/service")
public class ServiceReservationController {

    private final ServiceReservationService reservationService;

    @Autowired
    public ServiceReservationController(ServiceReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/add")
    public String createReservation(@RequestBody ServiceReservation reservation){
        reservationService.createNewReservation(reservation);
        return "New reservation is added";
    }

}

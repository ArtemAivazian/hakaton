package com.example.hakaton.Controller;


import com.example.hakaton.Objects.ServiceReservation;
import com.example.hakaton.Services.ServiceReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class ServiceReservationController {

    private final ServiceReservationService reservationService;

    @GetMapping
    public List<?> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/add")
    public String createReservation(@RequestBody ServiceReservation reservation){
        reservationService.createNewReservation(reservation);
        return "New reservation is added";
    }

}

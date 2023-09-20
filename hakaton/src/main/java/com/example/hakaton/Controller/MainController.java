package com.example.hakaton.Controller;


import com.example.hakaton.Objects.Reservation;
import com.example.hakaton.Services.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class MainController {

    private final ReservationService reservationService;


    @GetMapping
    public List<Reservation> getAllReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping("/add")
    public String createReservation(@RequestBody Reservation reservation){
        reservationService.createNewReservation(reservation);
        return "New student is added";
    }


}

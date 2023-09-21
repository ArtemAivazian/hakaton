package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationFormController {

    @GetMapping("/service-reservation-form")
    public String reservation() {
        return "service-reservation-form";
    }
}

package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationFormController {

    @GetMapping("/")
    public String reservation() {
        return "reservation";
    }
}
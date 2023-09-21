package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Distributor {
    @GetMapping("/")
    public String itemReservation() {
        return "distributor";
    }
}

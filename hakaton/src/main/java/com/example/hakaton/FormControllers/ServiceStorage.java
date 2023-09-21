package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceStorage {
    @GetMapping("/service-storage")
    public String serviceReservation() {
        return "service-storage";
    }
}

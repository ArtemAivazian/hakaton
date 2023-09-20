package com.example.hakaton.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReservationFormController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
}

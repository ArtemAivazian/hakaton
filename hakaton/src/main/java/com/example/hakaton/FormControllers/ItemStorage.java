package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemReservationFormController {

    @GetMapping("/item-reservation-form")
    public String itemReservation() {
        return "item-reservation-form";
    }
}

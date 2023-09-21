package com.example.hakaton.FormControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemStorage {

    @GetMapping("/item-storage")
    public String itemReservation() {
        return "item-storage";
    }
}

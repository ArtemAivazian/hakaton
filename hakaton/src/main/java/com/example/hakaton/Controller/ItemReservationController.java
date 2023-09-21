package com.example.hakaton.Controller;

import com.example.hakaton.Objects.ItemsReservation;
import com.example.hakaton.Services.ItemReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemReservationController {
    private final ItemReservationService itemService;
    @PostMapping("/add")
    public String createItemReservation(@RequestBody ItemsReservation itemsReservation){
        itemService.createItemReservation(itemsReservation);
        return "New item reservation is added";
    }
}

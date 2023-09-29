package com.example.hakaton.API;

import com.example.hakaton.entity.ItemsReservation;
import com.example.hakaton.service.ItemReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemReservationController {

    private final ItemReservationService itemService;

    public ItemReservationController(ItemReservationService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/add")
    public String createItemReservation(@RequestBody ItemsReservation itemsReservation){
        itemService.createItemReservation(itemsReservation);
        return "New item reservation is added";
    }
}

package com.example.hakaton.API;

import com.example.hakaton.Entity.ItemsReservation;
import com.example.hakaton.Service.ItemReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class ItemReservationController {


    private final ItemReservationService itemService;

    @Autowired
    public ItemReservationController(ItemReservationService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/add")
    public String createItemReservation(@RequestBody ItemsReservation itemsReservation){
        itemService.createItemReservation(itemsReservation);
        return "New item reservation is added";
    }
}

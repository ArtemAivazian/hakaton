package com.example.hakaton.Controller;

import com.example.hakaton.Objects.ItemsReservation;
import com.example.hakaton.Services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final ItemService itemService;
    @PostMapping("/add")
    public String createItemReservation(@RequestBody ItemsReservation itemsReservation){
        itemService.createItemReservation(itemsReservation);
        return "New item reservation is added";
    }
}

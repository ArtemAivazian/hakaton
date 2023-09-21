package com.example.hakaton.Controller;


import com.example.hakaton.Objects.Items;
import com.example.hakaton.Services.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequiredArgsConstructor
@RequestMapping("/items-storage")
public class ItemController {
    private ItemsService itemsService;


    @PostMapping("/add")
    public String createItem(@RequestBody Items item){
        itemsService.createItem(item);
        return "added new item";
    }

    public String getAllItems(Model model){
        model.addAttribute(itemsService.getAllItems());
        return "item-storage";
    }
}

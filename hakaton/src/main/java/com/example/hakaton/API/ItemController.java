package com.example.hakaton.API;


import com.example.hakaton.entity.Items;
import com.example.hakaton.service.ItemsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class ItemController {
    private final ItemsService itemsService;

    public ItemController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @PostMapping("/addItem")
    @ResponseBody
    public void createItem(@RequestBody Items item){
        itemsService.createItem(item);
    }

    @DeleteMapping("/deleteItem/{itemId}")
    @ResponseBody
    public void deleteItem(@PathVariable UUID itemId) {
        itemsService.deleteItem(itemId);
    }


    @GetMapping("/displayItemStorage")
    public String displayData(Model model) {
        List<Items> data = itemsService.getAllItems();
        model.addAttribute("item", data);
        return "itemStorage"; // Return the name of the Thymeleaf template
    }
}

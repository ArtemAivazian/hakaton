package com.example.hakaton.API;


import com.example.hakaton.Entity.Items;
import com.example.hakaton.Service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {
    private final ItemsService itemsService;

    @Autowired
    public ItemController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }

    @PostMapping("/addItem")
    @ResponseBody
    public void createItem(@RequestBody Items item){
        itemsService.createItem(item);
    }

    @GetMapping("/displayItemStorage")
    public String displayData(Model model) {
        List<Items> data = itemsService.getAllItems();
        model.addAttribute("item", data);
        return "itemStorage"; // Return the name of the Thymeleaf template
    }
}

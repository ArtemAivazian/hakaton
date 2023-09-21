package com.example.hakaton.Controller;


import com.example.hakaton.Objects.Items;
import com.example.hakaton.Objects.Services;
import com.example.hakaton.Services.ItemsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ItemController {
    private final ItemsService itemsService;


    @PostMapping("/add-item")
    @ResponseBody
    public String createItem(@RequestBody Items item){
        itemsService.createItem(item);
        return "redirect:/items-storage";
    }

    @GetMapping("/display-item-storage")
    public String displayData(Model model) {
        List<Items> data = itemsService.getAllItems();
        model.addAttribute("item", data);
        return "item-storage"; // Return the name of the Thymeleaf template
    }
}

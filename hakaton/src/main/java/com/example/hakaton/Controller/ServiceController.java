package com.example.hakaton.Controller;

import com.example.hakaton.Objects.Items;
import com.example.hakaton.Objects.Service;
import com.example.hakaton.Objects.Services;
import com.example.hakaton.Services.ItemsService;
import com.example.hakaton.Services.ServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @PostMapping("/add-service") // Define the URL path for creating items
    @ResponseBody
    public String createService(@RequestBody Services service) {
        serviceService.createService(service);
        return "redirect:/services-storage"; // Redirect to the item list page after creation
    }

    @GetMapping("/display-service-storage")
    public String displayData(Model model) {
        List<Services> data = serviceService.getAllServices();
        model.addAttribute("service", data);
        return "service-storage"; // Return the name of the Thymeleaf template
    }
}

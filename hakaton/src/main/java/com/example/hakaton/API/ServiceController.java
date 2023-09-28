package com.example.hakaton.API;

import com.example.hakaton.Entity.Services;
import com.example.hakaton.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ServiceController {

    private final ServiceService serviceService;

    @Autowired
    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping("/addService") // Define the URL path for creating items
    @ResponseBody
    public void createService(@RequestBody Services service) {
        serviceService.createService(service);
    }

    @GetMapping("/displayServiceStorage")
    public String displayData(Model model) {
        List<Services> data = serviceService.getAllServices();
        model.addAttribute("service", data);
        return "serviceStorage"; // Return the name of the Thymeleaf template
    }
}

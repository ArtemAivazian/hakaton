package com.example.hakaton.API;

import com.example.hakaton.entity.Services;
import com.example.hakaton.service.ServiceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class ServiceController {

    private final ServiceService serviceService;


    public ServiceController(ServiceService serviceService) {
        this.serviceService = serviceService;
    }

    @PostMapping("/addService") // Define the URL path for creating items
    @ResponseBody
    public void createService(@RequestBody Services service) {
        serviceService.createService(service);
    }

    @DeleteMapping("/deleteService/{serviceId}")
    @ResponseBody
    public void deleteService(@PathVariable UUID serviceId) {
        serviceService.deleteService(serviceId);
    }

    @GetMapping("/displayServiceStorage")
    public String displayData(Model model) {
        List<Services> data = serviceService.getAllServices();
        model.addAttribute("service", data);
        return "serviceStorage"; // Return the name of the Thymeleaf template
    }
}

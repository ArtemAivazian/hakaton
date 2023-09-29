package com.example.hakaton.showPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowPage {
    @GetMapping("/")
    public String showDistributor() {
        return "distributor";
    }

    @GetMapping("/item-reservation-form")
    public String showItemReservationForm() {
        return "itemReservationForm";
    }

    @GetMapping("/service-reservation-form")
    public String showServiceReservationForm() {
        return "serviceReservationForm";
    }

    @GetMapping("/service-storage")
    public String showServices() {
        return "serviceStorage";
    }

    @GetMapping("/item-storage")
    public String itemReservation() {
        return "itemStorage";
    }

}

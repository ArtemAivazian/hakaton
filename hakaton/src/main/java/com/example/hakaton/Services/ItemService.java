package com.example.hakaton.Services;


import com.example.hakaton.Objects.ItemsReservation;
import com.example.hakaton.Objects.Reservation;
import com.example.hakaton.Repositories.ItemRepository;
import com.example.hakaton.Repositories.ReservationRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void createItemReservation(ItemsReservation itemReservation){
        itemRepository.save(itemReservation);
        log.info("Saving new item reservation : Id {}", itemReservation.getId());
    }
}

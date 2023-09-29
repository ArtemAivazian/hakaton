package com.example.hakaton.service;


import com.example.hakaton.entity.ItemsReservation;
import com.example.hakaton.DAO.ItemReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j //for logging
public class ItemReservationService {

    private final ItemReservationRepository itemRepository;

    public ItemReservationService(ItemReservationRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItemReservation(ItemsReservation itemReservation){
        itemRepository.save(itemReservation);
        log.info("Saving new item reservation : Id {}", itemReservation.getId());
    }
}

package com.example.hakaton.Service;


import com.example.hakaton.Entity.ItemsReservation;
import com.example.hakaton.DataAccess.ItemReservationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j //for logging
public class ItemReservationService {

    private final ItemReservationRepository itemRepository;

    @Autowired
    public ItemReservationService(ItemReservationRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItemReservation(ItemsReservation itemReservation){
        itemRepository.save(itemReservation);
        log.info("Saving new item reservation : Id {}", itemReservation.getId());
    }
}

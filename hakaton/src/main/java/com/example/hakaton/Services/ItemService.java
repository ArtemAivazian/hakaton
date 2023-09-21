package com.example.hakaton.Services;


import com.example.hakaton.Objects.ItemsReservation;
import com.example.hakaton.Repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

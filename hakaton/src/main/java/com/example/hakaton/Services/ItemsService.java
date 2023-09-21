package com.example.hakaton.Services;


import com.example.hakaton.Objects.Items;
import com.example.hakaton.Repositories.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class ItemsService {

    private ItemRepository itemRepository;

    public void createItem(Items item){
        itemRepository.save(item);
        log.info("new item id : {}", item.getId());
    }

    public List<Items> getAllItems(){
        return itemRepository.findAll();
    }

    public Optional<Items> getItemById(UUID id){
       return itemRepository.findById(id);
    }
}

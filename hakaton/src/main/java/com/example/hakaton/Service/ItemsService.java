package com.example.hakaton.Service;


import com.example.hakaton.Entity.Items;
import com.example.hakaton.DataAccess.ItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j //for logging
public class ItemsService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemsService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItem(Items item){
        itemRepository.save(item);
        log.info("new item id : {}", item.getId());
    }

    public List<Items> getAllItems(){
        return itemRepository.findAll();
    }
}

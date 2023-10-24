package com.example.hakaton.service;


import com.example.hakaton.entity.Items;
import com.example.hakaton.DAO.ItemRepository;
import com.example.hakaton.exeption.ApiRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j //for logging
public class ItemsService {

    private final ItemRepository itemRepository;

    public ItemsService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public void createItem(Items item){
        itemRepository.save(item);
        log.info("new item id : {}", item.getId());
    }

    public void deleteItem(UUID itemId) {
        var itemsOptional = itemRepository.findById(itemId);
        if (itemsOptional.isPresent()) {
            itemRepository.deleteById(itemId);
            log.info("Deleted item with id: {}", itemId);
        } else {
            throw new ApiRequestException("Item not found for deletion");
//            throw new IllegalStateException("Item not found for deletion");
        }
    }

    public List<Items> getAllItems(){
        return itemRepository.findAll();
    }
}

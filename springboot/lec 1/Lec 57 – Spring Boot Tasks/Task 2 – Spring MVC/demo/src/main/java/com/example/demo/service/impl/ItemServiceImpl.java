package com.example.demo.service.impl;


import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
import com.example.demo.service.ItemService;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ItemServiceImpl implements ItemService {


    private final ItemRepository repository;


    public ItemServiceImpl(ItemRepository repository) {
        this.repository = repository;
    }


    @Override
    public Item addItem(Item item) {

        return repository.save(item);

    }


    @Override
    public List<Item> getAllItems() {

        return repository.findAll();

    }


    @Override
    public Item getItemById(Long id) {

        return repository.findById(id)
                .orElse(null);

    }


    @Override
    public Item updateItem(Long id, Item item) {


        Item oldItem = repository.findById(id)
                .orElse(null);


        if(oldItem != null){

            oldItem.setName(item.getName());

            oldItem.setPrice(item.getPrice());

            oldItem.setQuantity(item.getQuantity());


            return repository.save(oldItem);

        }


        return null;
    }



    @Override
    public void deleteItem(Long id) {

        repository.deleteById(id);

    }

}
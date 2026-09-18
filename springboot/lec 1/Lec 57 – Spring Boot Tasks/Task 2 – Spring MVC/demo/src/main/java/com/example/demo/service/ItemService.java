package com.example.demo.service;

import com.example.demo.model.Item;

import java.util.List;

public interface ItemService {

    Item addItem(Item item);

    List<Item> getAllItems();

    Item getItemById(Long id);

    Item updateItem(Long id, Item item);

    void deleteItem(Long id);
}
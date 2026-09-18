package com.example.demo.controller;


import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/items")
public class ItemController {


    private final ItemService service;


    public ItemController(ItemService service) {

        this.service = service;

    }



    // Add Item

    @PostMapping
    public Item addItem(@RequestBody Item item){

        return service.addItem(item);

    }




    // Show All Items

    @GetMapping
    public List<Item> getAllItems(){

        return service.getAllItems();

    }




    // Show Item By ID

    @GetMapping("/{id}")
    public Item getItemById(
            @PathVariable Long id){

        return service.getItemById(id);

    }




    // Update Item

    @PutMapping("/{id}")
    public Item updateItem(
            @PathVariable Long id,
            @RequestBody Item item){

        return service.updateItem(id,item);

    }




    // Delete Item

    @DeleteMapping("/{id}")
    public String deleteItem(
            @PathVariable Long id){

        service.deleteItem(id);

        return "Item deleted successfully";

    }

}
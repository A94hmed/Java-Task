package com.example.demo.controller;


import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/players")
@CrossOrigin
public class PlayerController {


    private final PlayerService service;


    public PlayerController(PlayerService service){

        this.service = service;

    }



    // SAVE PLAYER

    @PostMapping
    public Player save(
            @RequestBody Player player){

        return service.savePlayer(player);

    }



    // GET PLAYER BY ID

    @GetMapping("/{id}")
    public Player get(
            @PathVariable Long id){

        return service.getPlayer(id);

    }



    // UPDATE PLAYER

    @PutMapping("/{id}")
    public Player update(
            @PathVariable Long id,
            @RequestBody Player player){

        return service.updatePlayer(id,player);

    }




    // DELETE PLAYER

    @DeleteMapping("/{id}")
    public String delete(
            @PathVariable Long id){

        service.deletePlayer(id);

        return "Player Deleted";

    }


}
package com.example.demo.service;


import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PlayerService {


    private final PlayerRepository repository;


    public PlayerService(PlayerRepository repository){
        this.repository = repository;
    }



    // Save

    public Player savePlayer(Player player){

        return repository.save(player);

    }



    // Get By ID

    public Player getPlayer(Long id){

        return repository.findById(id)
                .orElse(null);

    }



    // Update

    public Player updatePlayer(Long id, Player player){

        Player oldPlayer =
                repository.findById(id)
                        .orElse(null);


        if(oldPlayer != null){

            oldPlayer.setName(player.getName());
            oldPlayer.setTeam(player.getTeam());
            oldPlayer.setAge(player.getAge());

            return repository.save(oldPlayer);

        }

        return null;
    }



    // Delete

    public void deletePlayer(Long id){

        repository.deleteById(id);

    }


}
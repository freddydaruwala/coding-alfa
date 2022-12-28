package com.game.player.service;

import com.game.player.entity.Player;
import com.game.player.exception.PlayerNotFoundException;
import com.game.player.repository.PlayerRepository;
import com.game.player.resource.PlayerResource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public PlayerResource player(Long id) {
        Optional<Player> player =  playerRepository.findById(id);
        Player p = player.orElseThrow(() -> {throw new PlayerNotFoundException("player not found!!");});

        PlayerResource resource = PlayerResource.builder()
                .email(p.getEmail())
                .firstName(p.getFirstName())
                .lastName(p.getLastName())
                .id(p.getId())
                .build();

        return resource;
    }
}







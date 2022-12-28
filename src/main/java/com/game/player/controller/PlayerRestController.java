package com.game.player.controller;

import com.game.player.entity.Player;
import com.game.player.resource.PlayerResource;
import com.game.player.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/player")
public class PlayerRestController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/{id}")
    public ResponseEntity<PlayerResource> getPlayerById(@PathVariable Long id) {
        PlayerResource playerResource = playerService.player(id);
        return ResponseEntity.ok(playerResource);

    }
}

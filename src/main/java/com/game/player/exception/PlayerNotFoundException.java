package com.game.player.exception;

public class PlayerNotFoundException extends RuntimeException{
    private String message;

    public PlayerNotFoundException(String message) {
        super(message);
        this.message = message;
    }


}

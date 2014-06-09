package com.foosboard.service;

import com.foosboard.domain.Player;
import com.foosboard.repository.PlayerRepository;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getPlayers(){
        List<Player> players = playerRepository.findAll();
        return players;
    }

    public Player getPlayer(String id) {
        return playerRepository.findOne(id);
    }

    public Object getPlayerRating(String id) {
        return JSON.parse("{'rating':42}");
    }
}

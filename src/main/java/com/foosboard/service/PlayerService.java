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

    public Player createPlayer(Player player) {
        return playerRepository.save(player);
    }

    public List<Player> retrievePlayers(){
        List<Player> players = playerRepository.findAll();
        return players;
    }

    public Player retrievePlayer(String id) {
        return playerRepository.findOne(id);
    }

    // TODO actual calculation
    public Object retrievePlayerRating(String id) {
        return JSON.parse("{'rating':42}");
    }

    // TODO check that save is supposed to be used for create and update.
    public Player updatePlayer(Player player){
        return playerRepository.save(player);
    }

    public void deletePlayer(String id){
        playerRepository.delete(id);
    }


}

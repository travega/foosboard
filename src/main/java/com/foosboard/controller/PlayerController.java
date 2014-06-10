package com.foosboard.controller;

import com.foosboard.domain.Player;
import com.foosboard.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value="/player", method=RequestMethod.POST)
    public Player postPlayer(@RequestBody Player player){
        return playerService.createPlayer(player);
    }

    @RequestMapping(value="/player", method = RequestMethod.GET)
    public List<Player> getPlayers() {
        return playerService.retrievePlayers();
    }

    @RequestMapping(value="/player/{id}", method= RequestMethod.GET)
    public Player getPlayer(@PathVariable String id) {
        return playerService.retrievePlayer(id);
    }

    @RequestMapping(value="/player/{id}/rating", method=RequestMethod.GET)
    public Object getPlayerRating(@PathVariable String id){
        return playerService.retrievePlayerRating(id);
    }

    @RequestMapping(value="player/{id}", method = RequestMethod.PUT)
    public Player putPlayer(@PathVariable String id, @RequestBody Player player){
        return playerService.updatePlayer(player);
    }

    @RequestMapping(value="/player/{id}", method=RequestMethod.DELETE)
    public void deletePlayer(@PathVariable String id){
        playerService.deletePlayer(id);
    }




}
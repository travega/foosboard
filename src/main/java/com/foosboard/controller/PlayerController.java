package com.foosboard.controller;

import com.foosboard.domain.Player;
import com.foosboard.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;

    @RequestMapping(value="/player", method = RequestMethod.GET)
    public @ResponseBody List<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @RequestMapping(value="/player/{id}", method= RequestMethod.GET)
    public @ResponseBody Player getPlayer(@PathVariable String id) {
        return playerService.getPlayer(id);

    }

    @RequestMapping(value="/player/{id}/rating", method=RequestMethod.GET)
    public @ResponseBody Object getPlayerRating(@PathVariable String id){
        return playerService.getPlayerRating(id);
    }




}
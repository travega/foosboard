package com.foosboard.controller;

import com.foosboard.domain.Player;
import com.foosboard.repository.PlayerRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
public class PlayerController {

    private static final Log LOG = LogFactory.getLog(PlayerController.class);

    @Autowired
    PlayerRepository playerRepository;

    @RequestMapping(value="/player/", method = RequestMethod.GET)
    public @ResponseBody List<Player> getPlayers() {
        LOG.info("getPlayers() called");
        List<Player> players = playerRepository.findAll();
        return players;
    }

    @RequestMapping(value="/player/{id}", method= RequestMethod.GET)
    public @ResponseBody Player getPlayer(@PathVariable String id) {
        LOG.info("getPlayer() called, id: " + id);
        Player player = playerRepository.findOne(id);
        return player;
    }

//    @RequestMapping(value="/player/{id}/rating", method=RequestMethod.GET)
//    public Model getPlayerRating(@PathVariable String id, @ModelAttribute Model model){
//        LOG.info("getPlayerRating() called, id: " + id);
//        HashMap<String, String> rating = new HashMap<String, String>();
//        rating.put("rating", "42");
//        model.addAttribute(rating);
//        return model;
//    }


}
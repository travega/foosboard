package com.foosboard.controller;

import com.foosboard.domain.Match;
import com.foosboard.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;

    @RequestMapping(value="/match", method= RequestMethod.POST)
    public @ResponseBody
    Match postMatch(@RequestBody Match match){
        return matchService.createMatch(match);
    }

    @RequestMapping(value="/match", method = RequestMethod.GET)
    public @ResponseBody
    List<Match> getMatchs() {
        return matchService.retrieveMatches();
    }

    @RequestMapping(value="/match/{id}", method= RequestMethod.GET)
    public @ResponseBody Match getMatch(@PathVariable String id) {
        return matchService.retrieveMatch(id);
    }

    @RequestMapping(value="match/{id}", method = RequestMethod.PUT)
    public @ResponseBody Match putMatch(@PathVariable String id, @RequestBody Match match){
        return matchService.updateMatch(match);
    }

    @RequestMapping(value="/match/{id}", method=RequestMethod.DELETE)
    public void deleteMatch(@PathVariable String id){
        matchService.deleteMatch(id);
    }
}

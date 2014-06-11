package com.foosboard.controller;

import com.foosboard.domain.Tournament;
import com.foosboard.service.TournamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@RestController
public class TournamentController {

    @Autowired
    TournamentService tournamentService;

    @RequestMapping(value="/tournament", method= RequestMethod.POST)
    public Tournament postTournament(@RequestBody Tournament Tournament){
        return tournamentService.createTournament(Tournament);
    }

    @RequestMapping(value="/tournament", method = RequestMethod.GET)
    public List<Tournament> getTournaments() {
        return tournamentService.retrieveTournaments();
    }

    @RequestMapping(value="/tournament/{id}", method= RequestMethod.GET)
    public Tournament getTournament(@PathVariable String id) {
        return tournamentService.retrieveTournament(id);
    }

    @RequestMapping(value="/tournament/{id}", method = RequestMethod.PUT)
    public Tournament putTournament(@PathVariable String id, @RequestBody Tournament Tournament){
        return tournamentService.updateTournament(Tournament);
    }

    @RequestMapping(value="/tournament/{id}", method=RequestMethod.DELETE)
    public void deleteTournament(@PathVariable String id){
        tournamentService.deleteTournament(id);
    }
}

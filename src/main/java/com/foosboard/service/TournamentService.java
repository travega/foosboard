package com.foosboard.service;

import com.foosboard.domain.ScoreBoard;
import com.foosboard.domain.Tournament;
import com.foosboard.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@Service
public class TournamentService {

    @Autowired
    TournamentRepository tournamentRepository;

    @Autowired
    ScoreBoard scoreBoard;

    public Tournament createTournament(Tournament tournament) {
        // TODO create a scoreboard
        return tournamentRepository.save(tournament);
    }

    public List<Tournament> retrieveTournaments(){
        List<Tournament> tournaments = tournamentRepository.findAll();
        return tournaments;
    }

    public Tournament retrieveTournament(String id) {
        return tournamentRepository.findOne(id);
    }

    public Tournament updateTournament(Tournament tournament){
        return tournamentRepository.save(tournament);
    }

    public void deleteTournament(String id){
        tournamentRepository.delete(id);
    }
}
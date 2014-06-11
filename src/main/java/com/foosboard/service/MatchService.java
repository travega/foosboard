package com.foosboard.service;

import com.foosboard.domain.Match;
import com.foosboard.repository.MatchRepository;
import com.foosboard.repository.RankingScoreRepository;
import com.foosboard.repository.TournamentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    RankingScoreRepository rankingScoreRepository;

    @Autowired
    TournamentRepository tournamentRepository;

    public Match createMatch(Match match) {
        return matchRepository.save(match);
    }

    public List<Match> retrieveMatches(){
        List<Match> matches = matchRepository.findAll();
        return matches;
    }

    public Match retrieveMatch(String id) {
        return matchRepository.findOne(id);
    }

    public Match updateMatch(Match match){
        // TODO Update ranking score for tournament scoreboard
        return matchRepository.save(match);
    }

    public void deleteMatch(String id){
        matchRepository.delete(id);
    }
}

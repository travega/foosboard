package com.foosboard.service;

import com.foosboard.domain.Match;
import com.foosboard.repository.MatchRepository;
import com.mongodb.util.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository matchRepository;

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
        return matchRepository.save(match);
    }

    public void deleteMatch(String id){
        matchRepository.delete(id);
    }
}

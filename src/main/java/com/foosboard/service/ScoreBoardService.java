package com.foosboard.service;

import com.foosboard.domain.ScoreBoard;
import com.foosboard.repository.ScoreBoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@Service
public class ScoreBoardService {

    @Autowired
    ScoreBoardRepository scoreBoardRepository;

    public ScoreBoard createScoreBoard(ScoreBoard scoreBoard) {
        return scoreBoardRepository.save(scoreBoard);
    }

    public List<ScoreBoard> retrieveScoreBoards(){
        List<ScoreBoard> scoreBoards = scoreBoardRepository.findAll();
        return scoreBoards;
    }

    public ScoreBoard retrieveScoreBoard(String id) {
        return scoreBoardRepository.findOne(id);
    }

    public ScoreBoard updateScoreBoard(ScoreBoard scoreBoard){
        return scoreBoardRepository.save(scoreBoard);
    }

    public void deleteScoreBoard(String id){
        scoreBoardRepository.delete(id);
    }

}
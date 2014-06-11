package com.foosboard.controller;

import com.foosboard.domain.ScoreBoard;
import com.foosboard.service.ScoreBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@RestController
public class ScoreBoardController {
    @Autowired
    ScoreBoardService scoreBoardService;

//    @RequestMapping(value="/scoreBoard", method= RequestMethod.POST)
//    public ScoreBoard postScoreBoard(@RequestBody ScoreBoard ScoreBoard){
//        return scoreBoardService.createScoreBoard(ScoreBoard);
//    }

    @RequestMapping(value="/scoreBoard", method = RequestMethod.GET)
    public List<ScoreBoard> getScoreBoards() {
        return scoreBoardService.retrieveScoreBoards();
    }

    @RequestMapping(value="/scoreBoard/{id}", method= RequestMethod.GET)
    public ScoreBoard getScoreBoard(@PathVariable String id) {
        return scoreBoardService.retrieveScoreBoard(id);
    }

//    @RequestMapping(value="/scoreBoard/{id}", method = RequestMethod.PUT)
//    public ScoreBoard putScoreBoard(@PathVariable String id, @RequestBody ScoreBoard ScoreBoard){
//        return scoreBoardService.updateScoreBoard(ScoreBoard);
//    }
//
//    @RequestMapping(value="/scoreBoard/{id}", method=RequestMethod.DELETE)
//    public void deleteScoreBoard(@PathVariable String id){
//        scoreBoardService.deleteScoreBoard(id);
    }
}

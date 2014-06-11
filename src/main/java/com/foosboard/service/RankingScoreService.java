package com.foosboard.service;

import com.foosboard.domain.RankingScore;
import com.foosboard.repository.RankingScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@Service
public class RankingScoreService {

    @Autowired
    RankingScoreRepository rankingScoreRepository;

    public RankingScore createRankingScore(RankingScore rankingScore) {
        return rankingScoreRepository.save(rankingScore);
    }

    public List<RankingScore> retrieveRankingScores(){
        List<RankingScore> rankingScores = rankingScoreRepository.findAll();
        return rankingScores;
    }

    public RankingScore retrieveRankingScore(String id) {
        return rankingScoreRepository.findOne(id);
    }

    public RankingScore updateRankingScore(RankingScore rankingScore){
        return rankingScoreRepository.save(rankingScore);
    }

    public void deleteRankingScore(String id){
        rankingScoreRepository.delete(id);
    }

}
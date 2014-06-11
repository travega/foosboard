package com.foosboard.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
public class ScoreBoard {

    @Id
    private String id;

    private Tournament tournament;
    private List<RankingScore> rankingScores;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public List<RankingScore> getRankingScores() {
        return rankingScores;
    }

    public void setRankingScores(List<RankingScore> rankingScores) {
        this.rankingScores = rankingScores;
    }
}

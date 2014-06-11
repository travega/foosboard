package com.foosboard.domain;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

/**
 * Created by travega on 11/06/2014.
 */
public class RankingScore {

    @Id
    String id;

    private Tournament tournament;
    private Player player;
    private BigDecimal rankingScore;

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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public BigDecimal getRankingScore() {
        return rankingScore;
    }

    public void setRankingScore(BigDecimal rankingScore) {
        this.rankingScore = rankingScore;
    }
}

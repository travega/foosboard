package com.foosboard.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
public class Tournament {

    @Id
    private String id;

    private String tournamentName;
    private String conferenceName;
    private Integer tournamentRank;
    private List<Player> players;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public Integer getTournamentRank() {
        return tournamentRank;
    }

    public void setTournamentRank(Integer tournamentRank) {
        this.tournamentRank = tournamentRank;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}


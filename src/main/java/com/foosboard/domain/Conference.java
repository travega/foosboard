package com.foosboard.domain;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
public class Conference {

    @Id
    private String id;

    private String conferenceName;
    private List<Tournament> tournaments;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getConferenceName() {
        return conferenceName;
    }

    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Tournament> tournaments) {
        this.tournaments = tournaments;
    }
}


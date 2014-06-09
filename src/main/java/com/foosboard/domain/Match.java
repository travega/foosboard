package com.foosboard.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Match {
	@Id
	private String id;

	@DBRef
	private List<Player> players;

	public Match(List<Player> players){
		this.players = players;
	}
}

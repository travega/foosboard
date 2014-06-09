package com.foosboard.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Player {
	@Id
	private String id;

	private String name;

	public Player(String name){
		this.name = name;
	}
}

package com.foosboard.repository;


import com.foosboard.domain.Tournament;

/**
 * Created by travega on 11/06/2014.
 */
@Repository
public interface TournamentRepository extends MongoRepository<Tournament, String> {
}


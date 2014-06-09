package com.foosboard.repository;

import com.foosboard.domain.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Match repository
 */
@Repository
public interface MatchRepository extends MongoRepository<Match, String> {}

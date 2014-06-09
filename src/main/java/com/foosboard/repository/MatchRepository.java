package com.foosboard.repository;

import com.foosboard.domain.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="match", path="match")
public interface MatchRepository extends MongoRepository<Match, String> {
}

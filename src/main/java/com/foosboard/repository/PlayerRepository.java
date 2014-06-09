package com.foosboard.repository;

import com.foosboard.domain.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel="player", path="player")
public interface PlayerRepository extends MongoRepository<Player, String>{
  List<Player> findByLastName(@Param("firstName") String firstName);
}

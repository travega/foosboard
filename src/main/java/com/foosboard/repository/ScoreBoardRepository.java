package com.foosboard.repository;


import com.foosboard.domain.ScoreBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by travega on 11/06/2014.
 */
@Repository
public interface ScoreBoardRepository extends MongoRepository<ScoreBoard, String> {
}


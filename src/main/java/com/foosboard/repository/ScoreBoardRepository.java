package com.foosboard.repository;


import com.foosboard.domain.ScoreBoard;

/**
 * Created by travega on 11/06/2014.
 */
@Repository
public interface ScoreBoardRepository extends MongoRepository<ScoreBoard, String> {
}


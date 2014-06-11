package com.foosboard.repository;


import com.foosboard.domain.RankingScore;

/**
 * Created by travega on 11/06/2014.
 */
@Repository
public interface RankingScoreRepository extends MongoRepository<RankingScore, String> {
}


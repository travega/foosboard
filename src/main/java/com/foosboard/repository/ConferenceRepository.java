package com.foosboard.repository;


import com.foosboard.domain.Conference;

/**
 * Created by travega on 11/06/2014.
 */
@Repository
public interface ConferenceRepository extends MongoRepository<Conference, String> {
}

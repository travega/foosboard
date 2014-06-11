package com.foosboard.service;

import com.foosboard.domain.Conference;
import com.foosboard.repository.ConferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@Service
public class ConferenceService {

    @Autowired
    ConferenceRepository conferenceRepository;

    public Conference createConference(Conference conference) {
        return conferenceRepository.save(conference);
    }

    public List<Conference> retrieveConferences(){
        List<Conference> conferences = conferenceRepository.findAll();
        return conferences;
    }

    public Conference retrieveConference(String id) {
        return conferenceRepository.findOne(id);
    }

    public Conference updateConference(Conference conference){
        return conferenceRepository.save(conference);
    }

    public void deleteConference(String id){
        conferenceRepository.delete(id);
    }
}
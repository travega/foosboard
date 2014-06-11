package com.foosboard.controller;

import com.foosboard.domain.Conference;
import com.foosboard.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by travega on 11/06/2014.
 */
@RestController
public class ConferenceController {

    @Autowired
    ConferenceService conferenceService;

    @RequestMapping(value="/conference", method= RequestMethod.POST)
    public Conference postConference(@RequestBody Conference Conference){
        return conferenceService.createConference(Conference);
    }

    @RequestMapping(value="/conference", method = RequestMethod.GET)
    public List<Conference> getConferences() {
        return conferenceService.retrieveConferences();
    }

    @RequestMapping(value="/conference/{id}", method= RequestMethod.GET)
    public Conference getConference(@PathVariable String id) {
        return conferenceService.retrieveConference(id);
    }

    @RequestMapping(value="/conference/{id}", method = RequestMethod.PUT)
    public Conference putConference(@PathVariable String id, @RequestBody Conference Conference){
        return conferenceService.updateConference(Conference);
    }

    @RequestMapping(value="/conference/{id}", method=RequestMethod.DELETE)
    public void deleteConference(@PathVariable String id){
        conferenceService.deleteConference(id);
    }
}

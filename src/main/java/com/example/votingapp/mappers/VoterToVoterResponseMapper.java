package com.example.votingapp.mappers;

import com.example.votingapp.entities.Voter;
import com.example.votingapp.models.VoterResponse;
import org.springframework.stereotype.Component;

@Component
public class VoterToVoterResponseMapper {

    public VoterResponse map(Voter voter) {
        return new VoterResponse(voter.getFirstName(), voter.getLastName());
    }

}

package com.example.votingapp.mappers;

import com.example.votingapp.entities.Voter;
import com.example.votingapp.models.VoterResponse;
import org.springframework.stereotype.Component;

@Component
public class VoterToVoterResponseMapper {

    public VoterResponse map(Voter voter) {
        return VoterResponse.builder()
                .voterId(voter.getVoterId())
                .firstName(voter.getFirstName())
                .lastName(voter.getLastName())
                .build();
    }

}

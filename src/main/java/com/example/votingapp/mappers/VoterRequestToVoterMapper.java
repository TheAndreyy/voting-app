package com.example.votingapp.mappers;

import com.example.votingapp.entities.Voter;
import com.example.votingapp.models.VoterRequest;
import org.springframework.stereotype.Component;

@Component
public class VoterRequestToVoterMapper {

    public Voter map(VoterRequest request) {
        return Voter.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();
    }

}

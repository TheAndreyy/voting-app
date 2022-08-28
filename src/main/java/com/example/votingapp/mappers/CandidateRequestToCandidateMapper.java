package com.example.votingapp.mappers;

import com.example.votingapp.entities.Candidate;
import com.example.votingapp.models.CandidateRequest;
import org.springframework.stereotype.Component;

@Component
public class CandidateRequestToCandidateMapper {

    public Candidate map(CandidateRequest request) {
        return Candidate.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .build();
    }

}

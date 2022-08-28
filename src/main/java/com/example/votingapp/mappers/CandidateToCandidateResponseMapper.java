package com.example.votingapp.mappers;

import com.example.votingapp.entities.Candidate;
import com.example.votingapp.models.CandidateResponse;
import org.springframework.stereotype.Component;

@Component
public class CandidateToCandidateResponseMapper {

    public CandidateResponse map(Candidate candidate) {
        return CandidateResponse.builder()
                .candidateId(candidate.getCandidateId())
                .firstName(candidate.getFirstName())
                .lastName(candidate.getLastName())
                .build();
    }

}

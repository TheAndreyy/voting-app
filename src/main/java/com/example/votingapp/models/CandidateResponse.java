package com.example.votingapp.models;

import lombok.Builder;

@Builder
public record CandidateResponse(
        Integer candidateId,
        String firstName,
        String lastName
) {
}

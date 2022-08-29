package com.example.votingapp.models;

import lombok.Builder;

@Builder
public record VoterResponse(
        Integer voterId,
        String firstName,
        String lastName
) {
}

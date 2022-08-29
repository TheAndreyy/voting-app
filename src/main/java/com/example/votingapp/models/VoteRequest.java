package com.example.votingapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VoteRequest {

    private Integer candidateId;
    private Integer voterId;

}

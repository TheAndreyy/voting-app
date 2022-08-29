package com.example.votingapp.models;

import com.example.votingapp.validators.CandidateExists;
import com.example.votingapp.validators.VoterExists;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@CandidateExists
@VoterExists
public class VoteRequest {

    @NotNull
    private Integer candidateId;

    @NotNull
    private Integer voterId;

}

package com.example.votingapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class CandidateRequest {

    @NotBlank
    String firstName;

    @NotBlank
    String lastName;

}

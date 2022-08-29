package com.example.votingapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class VoterRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

}

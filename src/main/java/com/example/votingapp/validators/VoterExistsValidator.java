package com.example.votingapp.validators;

import com.example.votingapp.models.VoteRequest;
import com.example.votingapp.repositories.VoterRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class VoterExistsValidator implements ConstraintValidator<VoterExists, VoteRequest> {

    private final VoterRepository repository;

    @Override
    public boolean isValid(VoteRequest request, ConstraintValidatorContext context) {
        return repository.existsById(request.getVoterId());
    }
}

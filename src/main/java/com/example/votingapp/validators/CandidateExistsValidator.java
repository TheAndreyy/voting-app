package com.example.votingapp.validators;

import com.example.votingapp.models.VoteRequest;
import com.example.votingapp.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@RequiredArgsConstructor
public class CandidateExistsValidator implements ConstraintValidator<CandidateExists, VoteRequest> {

    private final CandidateRepository repository;

    @Override
    public boolean isValid(VoteRequest request, ConstraintValidatorContext context) {
        return repository.existsById(request.getCandidateId());
    }
}

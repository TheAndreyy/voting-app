package com.example.votingapp.services;

import com.example.votingapp.mappers.CandidateToCandidateResponseMapper;
import com.example.votingapp.models.CandidateResponse;
import com.example.votingapp.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CandidateService {

    private final CandidateRepository repository;
    private final CandidateToCandidateResponseMapper responseMapper;

    public List<CandidateResponse> getAllCandidates() {
        return repository.findAll().stream()
                .map(responseMapper::map)
                .toList();
    }

}

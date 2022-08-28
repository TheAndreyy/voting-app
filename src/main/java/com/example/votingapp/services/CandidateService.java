package com.example.votingapp.services;

import com.example.votingapp.entities.Candidate;
import com.example.votingapp.mappers.CandidateRequestToCandidateMapper;
import com.example.votingapp.mappers.CandidateToCandidateResponseMapper;
import com.example.votingapp.models.CandidateRequest;
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
    private final CandidateRequestToCandidateMapper requestMapper;

    public List<CandidateResponse> getAllCandidates() {
        return repository.findAll().stream()
                .map(responseMapper::map)
                .toList();
    }

    public CandidateResponse createCandidate(CandidateRequest request) {
        Candidate candidate = repository.save(requestMapper.map(request));
        return responseMapper.map(candidate);
    }

}

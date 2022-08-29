package com.example.votingapp.services;

import com.example.votingapp.entities.Voter;
import com.example.votingapp.mappers.VoterRequestToVoterMapper;
import com.example.votingapp.mappers.VoterToVoterResponseMapper;
import com.example.votingapp.models.VoterRequest;
import com.example.votingapp.models.VoterResponse;
import com.example.votingapp.repositories.VoterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VoterService {

    private final VoterRepository repository;
    private final VoterToVoterResponseMapper responseMapper;
    private final VoterRequestToVoterMapper requestMapper;

    public List<VoterResponse> getAllVoters() {
        return repository.findAll().stream()
                .map(responseMapper::map)
                .toList();
    }

    public VoterResponse createVoter(VoterRequest request) {
        Voter voter = repository.save(requestMapper.map(request));
        return responseMapper.map(voter);
    }

}

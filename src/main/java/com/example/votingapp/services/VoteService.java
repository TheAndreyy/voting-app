package com.example.votingapp.services;

import com.example.votingapp.entities.Vote;
import com.example.votingapp.entities.Vote.VoteCompositeKey;
import com.example.votingapp.models.VoteRequest;
import com.example.votingapp.repositories.VoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoteService {

    private final VoteRepository repository;

    public void castVote(VoteRequest request) {
        repository.save(new Vote(new VoteCompositeKey(
                request.getCandidateId(),
                request.getVoterId()
        )));
    }

}

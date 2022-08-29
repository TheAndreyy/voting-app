package com.example.votingapp.repositories;

import com.example.votingapp.entities.Vote;
import com.example.votingapp.entities.Vote.VoteCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, VoteCompositeKey> {
}

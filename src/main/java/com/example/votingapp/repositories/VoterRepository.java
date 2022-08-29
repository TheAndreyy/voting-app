package com.example.votingapp.repositories;

import com.example.votingapp.entities.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter, Integer> {
}

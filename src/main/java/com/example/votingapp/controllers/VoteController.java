package com.example.votingapp.controllers;

import com.example.votingapp.config.ApplicationConstants;
import com.example.votingapp.models.VoteRequest;
import com.example.votingapp.services.VoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(ApplicationConstants.API_PREFIX)
@RequiredArgsConstructor
public class VoteController {

    private final VoteService service;

    @PostMapping("vote")
    public ResponseEntity<Void> castVote(@RequestBody @Valid VoteRequest request) {
        service.castVote(request);
        return ResponseEntity.accepted().build();
    }

}

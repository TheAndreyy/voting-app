package com.example.votingapp.controllers;

import com.example.votingapp.config.ApplicationConstants;
import com.example.votingapp.models.VoterResponse;
import com.example.votingapp.services.VoterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(ApplicationConstants.API_PREFIX)
@RequiredArgsConstructor
public class VoterController {

    private final VoterService service;

    @GetMapping("voters")
    public ResponseEntity<List<VoterResponse>> getAllVoters() {
        return ResponseEntity.ok(service.getAllVoters());
    }
}

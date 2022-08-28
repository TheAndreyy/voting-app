package com.example.votingapp.controllers;

import com.example.votingapp.config.ApplicationConstants;
import com.example.votingapp.models.CandidateRequest;
import com.example.votingapp.models.CandidateResponse;
import com.example.votingapp.services.CandidateService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(ApplicationConstants.API_PREFIX)
@AllArgsConstructor
public class CandidateController {

    private final CandidateService service;

    @GetMapping("candidates")
    public ResponseEntity<List<CandidateResponse>> getAllCandidates() {
        return ResponseEntity.ok(service.getAllCandidates());
    }

    @PostMapping("candidate")
    public ResponseEntity<CandidateResponse> createCandidate(@RequestBody CandidateRequest request) {
        return ResponseEntity.ok(service.createCandidate(request));
    }

}

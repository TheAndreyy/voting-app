package com.example.votingapp.controllers

import com.example.votingapp.WebMvcSpecIT
import com.example.votingapp.config.ApplicationConstants
import com.example.votingapp.entities.Candidate
import com.example.votingapp.entities.Voter
import com.example.votingapp.repositories.CandidateRepository
import com.example.votingapp.repositories.VoteRepository
import com.example.votingapp.repositories.VoterRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.transaction.annotation.Transactional
import org.testcontainers.spock.Testcontainers

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@Testcontainers
@Transactional
class VoteControllerSpecIT extends WebMvcSpecIT {

    @Autowired
    CandidateRepository candidateRepository

    @Autowired
    VoterRepository voterRepository

    @Autowired
    VoteRepository voteRepository

    void cleanup() {
        voteRepository.deleteAll()
        candidateRepository.deleteAll()
        voterRepository.deleteAll()
    }

    def "It should properly cast vote"() {
        given:
        def candidateId = candidateRepository.save(new Candidate(firstName: "John", lastName: "Doe")).candidateId
        def voterId = voterRepository.save(new Voter(firstName: "Jane", lastName: "Doe")).voterId

        when:
        def result = mvc.perform(post(ApplicationConstants.API_PREFIX + "/vote")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                        "candidateId": $candidateId,
                        "voterId": $voterId
                    }"""))

        then:
        result.andExpect(status().isAccepted())
        def votes = voteRepository.findAll()
        votes.size() == 1
        votes[0].voteCompositeKey.voterId == voterId
        votes[0].voteCompositeKey.candidateId == candidateId
    }

    def "It should return bad request for non existent candidate"() {
        when:
        def result = mvc.perform(post(ApplicationConstants.API_PREFIX + "/vote")
                .contentType(MediaType.APPLICATION_JSON)
                .content("""
                    {
                        "candidateId": 1,
                        "voterId": 1
                    }"""))

        then:
        result.andExpect(status().isBadRequest())
    }

}

package com.example.votingapp.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "votes")
public class Vote {

    @EmbeddedId
    private VoteCompositeKey voteCompositeKey;

    public Vote(VoteCompositeKey voteCompositeKey) {
        this.voteCompositeKey = voteCompositeKey;
    }

    @ManyToOne
    @JoinColumn(name = "candidate_id", insertable = false, updatable = false)
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "voter_id", insertable = false, updatable = false)
    private Voter voter;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class VoteCompositeKey implements Serializable {

        @Column(name = "candidate_id")
        private Integer candidateId;

        @Column(name = "voter_id")
        private Integer voterId;

    }

}

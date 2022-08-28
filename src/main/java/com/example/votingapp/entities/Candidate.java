package com.example.votingapp.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer candidateId;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "candidate")
    private List<Vote> votes = new ArrayList<>();

}

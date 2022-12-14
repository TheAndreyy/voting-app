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
@Table(name = "voters")
public class Voter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer voterId;

    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "voter")
    @Builder.Default
    List<Vote> votes = new ArrayList<>();

}

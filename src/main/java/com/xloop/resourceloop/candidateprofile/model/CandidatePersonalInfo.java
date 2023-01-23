package com.xloop.resourceloop.candidateprofile.model;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "candidate_personal_information")
public class CandidatePersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String nationalIdentityNumber;
    private String city;
    private String address;
    private String linkedProfile;
    private String maritalStatus;
}

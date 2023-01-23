package com.xloop.resourceloop.candidateprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.xloop.resourceloop.candidateprofile.model.CandidatePersonalInfo;
import com.xloop.resourceloop.candidateprofile.service.CandidatePersonalInfoService;

@RestController
@RequestMapping("/api/personal-information")
public class CandidatePersonalInfoController {

    @Autowired
    public CandidatePersonalInfoService PersonalInfoService;

    @PostMapping
    public ResponseEntity<CandidatePersonalInfo> createPersonalInformation(@RequestBody CandidatePersonalInfo personalInformation) {
        CandidatePersonalInfo createdPersonalInformation = PersonalInfoService.createPersonalInformation(personalInformation);
        return new ResponseEntity<>(createdPersonalInformation, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CandidatePersonalInfo> getPersonalInformationById(@PathVariable Long id) {
        CandidatePersonalInfo personalInformation = PersonalInfoService.getPersonalInformationById(id);
        if (personalInformation == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(personalInformation, HttpStatus.OK);
    }
    
}

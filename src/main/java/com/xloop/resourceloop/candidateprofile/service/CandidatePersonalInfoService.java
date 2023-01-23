package com.xloop.resourceloop.candidateprofile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;
import com.xloop.resourceloop.candidateprofile.model.CandidatePersonalInfo;
import com.xloop.resourceloop.candidateprofile.repository.ICandidatePersonalInfoRepository;

@Service
public class CandidatePersonalInfoService {
    @Autowired
    public ICandidatePersonalInfoRepository personalInfoRepo;

    public CandidatePersonalInfo createPersonalInformation(CandidatePersonalInfo personalInformation) {
        return personalInfoRepo.save(personalInformation);
    }

    public CandidatePersonalInfo getPersonalInformationById(Long id) {
        return personalInfoRepo.findById(id).orElse(null);
    }
}

package com.xloop.resourceloop.candidateprofile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xloop.resourceloop.candidateprofile.model.CandidateWorkExperience;
import com.xloop.resourceloop.candidateprofile.repository.ICandidateWorkExperienceRepository;

public class CandidateWorkExperienceService {
    
    @Autowired
    public ICandidateWorkExperienceRepository workExperienceRepo;
    
    public CandidateWorkExperience create_work_experience(CandidateWorkExperience cand_work_experience){
        return cand_work_experience;
    }
   public CandidateWorkExperience get_work_experience(Long id){
    return get_work_experience(id);
    }

    public List<CandidateWorkExperience> get_all_work_experience(){
        return get_all_work_experience();
    }

    
}

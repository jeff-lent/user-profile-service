package com.xloop.resourceloop.candidateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;

@Repository
public interface ICandidateAcademicInfoRepository extends JpaRepository<CandidateAcademicInfo,Long> {}

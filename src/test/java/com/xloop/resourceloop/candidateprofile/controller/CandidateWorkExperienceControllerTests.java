package com.xloop.resourceloop.candidateprofile.controller;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xloop.resourceloop.candidateprofile.model.CandidateWorkExperience;
import com.xloop.resourceloop.candidateprofile.model.control_vocabulary.JobType_Enum;
import com.xloop.resourceloop.candidateprofile.service.CandidateWorkExperienceService;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class CandidateWorkExperienceControllerTests {
    private MockMvc mockMvc;
    private CandidateWorkExperience work_experience;
    @Mock
    private  CandidateWorkExperienceService work_experience_service;

    @InjectMocks
    private CandidateWorkExperienceController work_experience_controller;

    private JacksonTester json_work_experience;
    @BeforeEach
    public void setUp(){

        JacksonTester.initFields(this,new ObjectMapper());
        mockMvc= MockMvcBuilders.standaloneSetup(work_experience_controller).build();

        work_experience = new CandidateWorkExperience();
        work_experience.setId(1L);
        work_experience.setJobTitle("SoftWare Engieer");
        work_experience.setJobType(JobType_Enum.FULL_TIME);
        work_experience.setCompanyName("Systems");
        work_experience.setCurrentWorkingHere(false);
        work_experience.setStartDate(Date.valueOf(LocalDate.of(2021, 01, 01)));
        work_experience.setEndDate(Date.valueOf(LocalDate.of(2022, 01, 01)));
        work_experience.setUser_id(1L);
    }

    @Test
    public void can_save_work_experience(){
        when(work_experience_service.saveWorkExperience(work_experience)).thenReturn(work_experience);
        mockMvc.perform(post("/api/work-experience")
        .contentType(MediaType.APPLICATION_JSON)
        .contentType(json_work_experience.write(work_experience).getJson()))
        .andExpect(status().isOk())
        .andExpect(json_work_experience.write(work_experience).getJson());
    }

    @Test 
    public void can_get_work_experience_ById(){
        when(work_experience_service.get_work_experience_by_id(work_experience.getId())).thenReturn(work_experience);
        mockMvc.perform(get("/api/work-experience/1")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(json_work_experience.write(work_experience).getJson());
    }
    @Test 
    public void can_update_work_experience_byId(){
        work_experience.setJobTitle("SoftWare Engieer and Teaching Assistant");
        when(work_experience_service.update_work_experience_ById(work_experience.getId())).thenReturn(work_experience);
        mockMvc.perform(put("/api/work-experience/1")
        .contentType(MediaType.APPLICATION_JSON)
        .contentType(json_work_experience.write(work_experience).getJson()))
        .andExpect(status().isOk())
        .andExpect(json_work_experience.write(work_experience).getJson())
        .andExpect(jsonPath("$.jobTitle", is("SoftWare Engieer and Teaching Assistant")));
    }
    
}

package com.xloop.resourceloop.candidateprofile.controller;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.time.LocalDate;


import org.checkerframework.checker.units.qual.C;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.xloop.resourceloop.candidateprofile.controller.CandidateAcademicInfoController;
import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;
import com.xloop.resourceloop.candidateprofile.service.CandidateAcademicInfoService;

public class CandidateAcademicInfoControllerTest {

    @Mock
    private CandidateAcademicInfoService academicInfoService;

    @InjectMocks
    private CandidateAcademicInfoController controller;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateAcademicInformation() {
        CandidateAcademicInfo academicInformation = new CandidateAcademicInfo();
        academicInformation.setCurrentDegree("56deg");
        academicInformation.setCGPA("3.4");
        // academicInformation.setCertificates("Certificate");
        academicInformation.setDegree_progress("Yes");
        academicInformation.setFinal_Year_Project("FYP");
        academicInformation.setInstitute("NED");
        academicInformation.setTitle("BS");
        
        academicInformation.setGraduation_date(Date.valueOf(LocalDate.of(2020,01,01)));
        

        when(academicInfoService.createAcademicInformation(academicInformation)).thenReturn(academicInformation);
        

        ResponseEntity<CandidateAcademicInfo> response = controller.createAcademicInformation(academicInformation);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(academicInformation, response.getBody());
    }

    // @Test
    // public void testGetAllAcademicInformation() {
    // List<CandidateAcademicInfo> expected = Arrays.asList(
    //         new CandidateAcademicInfo(), new CandidateAcademicInfo());
    // when(academicInfoService.getAllAcademicInformation()).thenReturn(expected);

    // List<CandidateAcademicInfo> actual = controller.getAllAcademicInformation();

    // verify(academicInfoService).getAllAcademicInformation();
    // assertEquals(expected, actual);}

    // @Test
    // public void testGetAcademicInformatioById() throws Exception {
    //     CandidateAcademicInfo academicInformation = new CandidateAcademicInfo("Graduation", 3.7f,"Certificates","Yes","FYP","NED",
    //     "2021-11-11","BS");
    //     academicInformation.setId(1L);
    //     when(academicInfoService.getAcademicInformationById(1L)).thenReturn(academicInformation);

    //     mockMvc.perform(get("/api/personal-information/1")
    //             .contentType(MediaType.APPLICATION_JSON))
    //             .andExpect(status().isOk())
    //             .andExpect(content().json(jsonPersonalInformation.write(personalInformation).getJson()));
    // }


}

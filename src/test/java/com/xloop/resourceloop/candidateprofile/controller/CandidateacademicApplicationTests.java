// package com.xloop.resourceloop.candidateprofile.controller;

// import static org.mockito.Mockito.when;

// import java.time.LocalDate;
// import java.sql.Date;
// import java.util.List;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.ArgumentMatchers.any;
// import static org.mockito.ArgumentMatchers.anyLong;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;

// import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
// import org.springframework.boot.test.autoconfigure.web.servlet.MockMvcBuilderCustomizer;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.json.JacksonTester;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
// import org.springframework.test.web.servlet.setup.MockMvcBuilders;
// import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.MediaType;
// import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

// import com.fasterxml.jackson.core.JsonProcessingException;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.xloop.resourceloop.candidateprofile.controller.CandidateAcademicInfoController;
// import com.xloop.resourceloop.candidateprofile.controller.CandidatePersonalInfoController;
// import com.xloop.resourceloop.candidateprofile.model.CandidateAcademicInfo;
// import com.xloop.resourceloop.candidateprofile.service.CandidateAcademicInfoService;

// import ch.qos.logback.core.status.Status;

// import com.xloop.resourceloop.candidateprofile.repository.ICandidateAcademicInfoRepository;

// @SpringBootTest
// @AutoConfigureJsonTesters
// @AutoConfigureMockMvc

// public class CandidateacademicApplicationTests {

//     private MockMvc mvc;
//     CandidateAcademicInfo academicInformation;
//     String json;

//     @Mock
//     private CandidateAcademicInfoService academicInformationService;

//     @InjectMocks
//     private CandidateAcademicInfoController academicInformationController;
//     private JacksonTester<CandidateAcademicInfo> jsonAcademicInfo;
//     private JacksonTester<List<CandidateAcademicInfo>> jsonAcademicInfos;

//     @BeforeEach
//     public void setUp() throws JsonProcessingException {
//         JacksonTester.initFields(this, new ObjectMapper());
//         mvc = MockMvcBuilders.standaloneSetup(academicInformationController).build();

//         CandidateAcademicInfo academicInformation = new CandidateAcademicInfo();
//         academicInformation.setCurrentDegree("Inter");
//         academicInformation.setCGPA("3");
//         // academicInformation.setCertificates("sample certificate");
//         academicInformation.setTitle("Pre-medical");
//         academicInformation.setInstitute("KU");
//         academicInformation.setFinal_Year_Project("FYP");
//         academicInformation.setDegree_progress("NO");
//         academicInformation.setGraduation_date(Date.valueOf(LocalDate.of(2023, 01, 01)));

//         ObjectMapper mapper = new ObjectMapper();
//         json = mapper.writeValueAsString(academicInformationController);

//     }

//     @Test
//     public void testCreateAcademicInformation() throws Exception{
//         when(academicInformationService.createAcademicInformation(academicInformation)).thenReturn(academicInformation);
//         mvc.perform(post("/api/educational_information")
//             .contentType(MediaType.APPLICATION_JSON)
//             .content(jsonAcademicInfo.write(academicInformation).getJson()))
//             .andExpect(status().isCreated())
//             .andExpect(content().json(jsonAcademicInfo.write(academicInformation).getJson()));

//     }

// }
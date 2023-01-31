// package com.xloop.resourceloop.candidateprofile.model;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;

// import java.sql.Date;
// import java.time.LocalDate;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.xloop.resourceloop.candidateprofile.model.CandidateWorkExperience;
// import com.xloop.resourceloop.candidateprofile.model.control_vocabulary.JobType_Enum;

// @SpringBootTest
// public class CandidateWorkExperienceTests {

//     CandidateWorkExperience candWorkExperience;
    
//     @BeforeEach 
//     public void setUp(){
//         candWorkExperience = new CandidateWorkExperience();
//         candWorkExperience.setId(1L);
//         candWorkExperience.setJobTitle("SoftWare Engieer");
//         candWorkExperience.setJobType("Full Time");
//         candWorkExperience.setCompanyName("Systems");
//         candWorkExperience.setCurrentWorkingHere(false);
//         candWorkExperience.setStartDate(Date.valueOf(LocalDate.of(2021, 01, 01)));
//         candWorkExperience.setEndDate(Date.valueOf(LocalDate.of(2022, 01, 01)));
//         candWorkExperience.setUser_id(1L);

//     }
//     @Test
//     public void testJobisCreated(){
//         assertNotNull(candWorkExperience.getId()); 
//         assertEquals(1L, candWorkExperience.getUser_id());
//         assertEquals(JobType_Enum.FULL_TIME, candWorkExperience.getJobType());
//         assertEquals("Systems", candWorkExperience.getCompanyName());
//         assertEquals(false, candWorkExperience.getCurrentWorkingHere());
//         assertNotNull(candWorkExperience.getEndDate());
//     }

// //     @Test(value="If currentWorkingHere is true then EndDate should be empty")
// //     public void endDate
// }

package com.example.University.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CourseDetailsDTO {

    private Long id;
    private String title;
    private String description;

    private InstructorInfo instructor;

    private List<StudentInfo> students;

    @Data
    @AllArgsConstructor
    public static class InstructorInfo {

        private Long id;
        private String name;
        private String email;
    }

    @Data
    @AllArgsConstructor
    public static class StudentInfo {

        private Long id;
        private String name;
        private String email;
    }
}
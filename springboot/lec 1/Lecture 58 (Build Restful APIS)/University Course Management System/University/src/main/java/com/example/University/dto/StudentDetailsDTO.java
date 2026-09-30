package com.example.University.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StudentDetailsDTO {

    private Long id;
    private String name;
    private String email;

    private List<CourseInfo> courses;

    @Data
    @AllArgsConstructor
    public static class CourseInfo {

        private Long id;
        private String title;
        private String description;

        private InstructorInfo instructor;
    }

    @Data
    @AllArgsConstructor
    public static class InstructorInfo {

        private Long id;
        private String name;
        private String email;
    }
}
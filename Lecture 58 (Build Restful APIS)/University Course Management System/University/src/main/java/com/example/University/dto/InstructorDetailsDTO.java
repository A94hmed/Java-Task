package com.example.University.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class InstructorDetailsDTO {

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

        private List<StudentInfo> students;
    }

    @Data
    @AllArgsConstructor
    public static class StudentInfo {

        private Long id;
        private String name;
        private String email;
    }
}
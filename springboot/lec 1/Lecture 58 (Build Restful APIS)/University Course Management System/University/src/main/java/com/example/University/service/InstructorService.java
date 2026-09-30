package com.example.University.service;

import com.example.University.dto.InstructorDetailsDTO;
import com.example.University.model.Instructor;
import com.example.University.repository.InstructorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;

    public InstructorService(
            InstructorRepository instructorRepository
    ) {

        this.instructorRepository = instructorRepository;
    }

    public Instructor createInstructor(Instructor instructor) {

        return instructorRepository.save(instructor);
    }

    public List<Instructor> getAllInstructors() {

        return instructorRepository.findAll();
    }

    @Transactional(readOnly = true)
    public InstructorDetailsDTO getInstructorById(Long id) {

        Instructor instructor =
                instructorRepository.findById(id)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Instructor not found"
                                )
                        );

        List<InstructorDetailsDTO.CourseInfo> courses =
                instructor.getCourses()
                        .stream()
                        .map(course -> {

                            List<InstructorDetailsDTO.StudentInfo> students =
                                    course.getStudents()
                                            .stream()
                                            .map(student ->
                                                    new InstructorDetailsDTO.StudentInfo(
                                                            student.getId(),
                                                            student.getName(),
                                                            student.getEmail()
                                                    )
                                            )
                                            .toList();

                            return new InstructorDetailsDTO.CourseInfo(
                                    course.getId(),
                                    course.getTitle(),
                                    course.getDescription(),
                                    students
                            );

                        })
                        .toList();

        return new InstructorDetailsDTO(
                instructor.getId(),
                instructor.getName(),
                instructor.getEmail(),
                courses
        );
    }
}
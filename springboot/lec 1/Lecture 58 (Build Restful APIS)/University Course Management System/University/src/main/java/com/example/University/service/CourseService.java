package com.example.University.service;

import com.example.University.dto.CourseDetailsDTO;
import com.example.University.model.Course;
import com.example.University.model.Instructor;
import com.example.University.repository.CourseRepository;
import com.example.University.repository.InstructorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;

    public CourseService(
            CourseRepository courseRepository,
            InstructorRepository instructorRepository
    ) {

        this.courseRepository = courseRepository;
        this.instructorRepository = instructorRepository;
    }

    public Course createCourse(Course course) {

        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {

        return courseRepository.findAll();
    }

    @Transactional
    public Course assignInstructor(
            Long courseId,
            Long instructorId
    ) {

        Course course = courseRepository.findById(courseId)
                .orElseThrow(
                        () -> new RuntimeException("Course not found")
                );

        Instructor instructor =
                instructorRepository.findById(instructorId)
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "Instructor not found"
                                )
                        );

        course.setInstructor(instructor);

        if (!instructor.getCourses().contains(course)) {
            instructor.getCourses().add(course);
        }

        return courseRepository.save(course);
    }

    @Transactional(readOnly = true)
    public CourseDetailsDTO getCourseById(Long id) {

        Course course = courseRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Course not found")
                );

        CourseDetailsDTO.InstructorInfo instructorInfo = null;

        if (course.getInstructor() != null) {

            instructorInfo =
                    new CourseDetailsDTO.InstructorInfo(
                            course.getInstructor().getId(),
                            course.getInstructor().getName(),
                            course.getInstructor().getEmail()
                    );
        }

        List<CourseDetailsDTO.StudentInfo> students =
                course.getStudents()
                        .stream()
                        .map(student ->
                                new CourseDetailsDTO.StudentInfo(
                                        student.getId(),
                                        student.getName(),
                                        student.getEmail()
                                )
                        )
                        .toList();

        return new CourseDetailsDTO(
                course.getId(),
                course.getTitle(),
                course.getDescription(),
                instructorInfo,
                students
        );
    }
}
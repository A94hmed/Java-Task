package com.example.University.service;

import com.example.University.dto.StudentDetailsDTO;
import com.example.University.model.Course;
import com.example.University.model.Student;
import com.example.University.repository.CourseRepository;
import com.example.University.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public StudentService(
            StudentRepository studentRepository,
            CourseRepository courseRepository
    ) {

        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Student createStudent(Student student) {

        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {

        return studentRepository.findAll();
    }

    @Transactional
    public Student registerCourse(
            Long studentId,
            Long courseId
    ) {

        Student student = studentRepository.findById(studentId)
                .orElseThrow(
                        () -> new RuntimeException("Student not found")
                );

        Course course = courseRepository.findById(courseId)
                .orElseThrow(
                        () -> new RuntimeException("Course not found")
                );

        if (!student.getCourses().contains(course)) {
            student.getCourses().add(course);
        }

        if (!course.getStudents().contains(student)) {
            course.getStudents().add(student);
        }

        return studentRepository.save(student);
    }

    @Transactional(readOnly = true)
    public StudentDetailsDTO getStudentById(Long id) {

        Student student = studentRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException("Student not found")
                );

        List<StudentDetailsDTO.CourseInfo> courses =
                student.getCourses()
                        .stream()
                        .map(course -> {

                            StudentDetailsDTO.InstructorInfo instructorInfo = null;

                            if (course.getInstructor() != null) {

                                instructorInfo =
                                        new StudentDetailsDTO.InstructorInfo(
                                                course.getInstructor().getId(),
                                                course.getInstructor().getName(),
                                                course.getInstructor().getEmail()
                                        );
                            }

                            return new StudentDetailsDTO.CourseInfo(
                                    course.getId(),
                                    course.getTitle(),
                                    course.getDescription(),
                                    instructorInfo
                            );

                        })
                        .toList();

        return new StudentDetailsDTO(
                student.getId(),
                student.getName(),
                student.getEmail(),
                courses
        );
    }
}
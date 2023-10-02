package com.example.demo.service;
import com.example.demo.model.Student;
import com.example.demo.model.Course;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepo;
    private final CourseRepository courseRepo;

    public StudentService(StudentRepository studentRepo, CourseRepository courseRepo) {
        this.studentRepo = studentRepo;
        this.courseRepo = courseRepo;
    }

    public Student saveStudent(Student s) {
        s.setEnrollDate(LocalDate.now());
        return studentRepo.save(s);
    }

    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Course saveCourse(Course c) {
        return courseRepo.save(c);
    }

    public List<Course> getCourses() {
        return courseRepo.findAll();
    }
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

// minor tweak: update verification rules and configs at 6968

// minor tweak: update verification rules and configs at 6470

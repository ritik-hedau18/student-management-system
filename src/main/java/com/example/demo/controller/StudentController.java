package com.example.demo.controller;
import com.example.demo.model.Student;
import com.example.demo.model.Course;
import com.example.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        return service.saveStudent(s);
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return service.getCourses();
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course c) {
        return service.saveCourse(c);
    }
// minor tweak: performance check updates
// minor tweak: performance check updates
}
// minor tweak: update verification rules and configs

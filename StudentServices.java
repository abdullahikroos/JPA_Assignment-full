package com.example.CA223_practice_JPA;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    private final StudentRepository repo;
    public StudentServices(StudentRepository repo) {
        this.repo = repo;
    }

    //operations
    //add
    void addStudent(Student student) {
        repo.save(student);
    }

    //update
    void updateStudent(Student newStudent , Long id) {

        repo.save(newStudent);
}
    //slectAllMore actions
    public List<Student> findAllStudents() {
        return repo.findAll();
    }

    //select by id
    public Student findStudentById(Long id) {
        return repo.findById(id).orElse(null);
    }

    //delete
    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }
}

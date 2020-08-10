package ru.geekbrains.springless.student.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import ru.geekbrains.springless.student.persistent.entities.Student;
import ru.geekbrains.springless.student.persistent.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public void removeStudent(Student student) {
        studentRepository.delete(student);
    }
}

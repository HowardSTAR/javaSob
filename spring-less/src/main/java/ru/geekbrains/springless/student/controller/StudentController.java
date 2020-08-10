package ru.geekbrains.springless.student.controller;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.geekbrains.springless.student.persistent.entities.Student;
import ru.geekbrains.springless.student.service.StudentService;

@Controller
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public String getStudentsList(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }
}

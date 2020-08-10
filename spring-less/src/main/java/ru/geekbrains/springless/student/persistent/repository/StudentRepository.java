package ru.geekbrains.springless.student.persistent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.springless.student.persistent.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

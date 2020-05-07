package it.academy.MayExam.Service;

import it.academy.MayExam.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student save(Student student);
    void delete(Long id);
}

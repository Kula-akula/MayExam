package it.academy.MayExam.Service.impl;

import it.academy.MayExam.Entity.Student;
import it.academy.MayExam.Repository.StudentRepo;
import it.academy.MayExam.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepo studentRepo;

    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void delete(Long id) {
        studentRepo.deleteById(id   );
    }
}

package it.academy.MayExam.Controller;

import it.academy.MayExam.Entity.Student;
import it.academy.MayExam.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    PasswordEncoder passwordEncoder;


    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity addItem(@Valid @RequestBody Student student){
        student.setName(passwordEncoder.encode(student.getName()));

        Student it=studentService.save(student);
        return new ResponseEntity(it,HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteItem(@PathVariable("id") Long id){
        studentService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}

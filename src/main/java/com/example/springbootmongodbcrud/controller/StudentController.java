package com.example.springbootmongodbcrud.controller;

import com.example.springbootmongodbcrud.entity.Student;
import com.example.springbootmongodbcrud.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {
   @Autowired
   private StudentRepo studentRepo;

    @GetMapping("/findAll")
    public List<Student> getAllStudent(){
        return studentRepo.findAll();
    }

    @GetMapping("/find/{id}")
    public Student getStudentById(@PathVariable  int id){
        return studentRepo.findById(id).get();
    }

    @PostMapping("/insert")
    public Student insert(@RequestBody Student student){

        return  studentRepo.save(student);
    }
}

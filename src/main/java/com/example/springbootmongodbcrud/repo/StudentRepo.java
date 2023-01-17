package com.example.springbootmongodbcrud.repo;

import com.example.springbootmongodbcrud.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student ,Integer> {
}

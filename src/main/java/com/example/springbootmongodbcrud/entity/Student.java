package com.example.springbootmongodbcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "student_collection")
public class Student {
    @Id
    private Integer id ;
    private String name ;
    private int age ;
}

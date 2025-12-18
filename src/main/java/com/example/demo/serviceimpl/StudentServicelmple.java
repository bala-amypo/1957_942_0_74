package com.example.demo.StudentServicelmple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Stuentity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServicelmple implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Stuentity saveStudent(Stuentity student){
        return studentRepository.save(student);
    }
    
}
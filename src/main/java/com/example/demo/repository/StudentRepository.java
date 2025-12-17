package com.example.demo.respository;

import org.springframework.data.jpa.respository.JpaRepository;

import com.example.demo.entity.Student;

public interface StudentRespository extends JpaRepository<Student,Long>{
    

}
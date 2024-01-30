package com.project.first.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.first.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}

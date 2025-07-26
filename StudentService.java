package com.gayu.studentinfo.studentdetail.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gayu.studentinfo.studentdetail.repository.StudentRepository;
import com.gayu.studentinfo.studentdetail.model.Student;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student createStudent(Student student) {
        return repo.save(student);
    }
    
    public Student updateStudent(Student student) {
    	return repo.save(student);
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public Optional<Student> getById(int id) {
        return repo.findById(id);
    }

    public void deleteById(int id) {
        repo.deleteById(id);
    }
}

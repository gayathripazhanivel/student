package com.gayu.studentinfo.studentdetail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.gayu.studentinfo.studentdetail.model.Student;
import com.gayu.studentinfo.studentdetail.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("createstudent")
    public String addStudent(@RequestBody Student student) {
         service.createStudent(student);
         return "Student Created Successfully";
    }
    @PutMapping("updatestudent")
    public String updateStudent(@RequestBody Student student) {
        service.updateStudent(student);
        return "Student Updated Successfully";
    }
    @GetMapping("readstudents")
    public List<Student> getAllStudents() {
        return service.getAll();
    }

    @GetMapping("readstudent")
    public Student getStudentById(@PathVariable int id) {
        return service.getById(id).orElse(null);
    }

    @DeleteMapping("deletestudent")
    public String deleteStudent(@PathVariable int id) {
        service.deleteById(id);
        return "Student Deleted Successfully";
    }
}

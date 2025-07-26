package com.gayu.studentinfo.studentdetail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gayu.studentinfo.studentdetail.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

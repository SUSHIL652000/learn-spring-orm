package com.lcwd.orm.repositeries;

import com.lcwd.orm.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}

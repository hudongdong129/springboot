package com.imooc.sell.repository;

import com.imooc.sell.VO.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}

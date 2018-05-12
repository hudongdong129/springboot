package com.imooc.sell.service.impl;

import com.imooc.sell.VO.Book;
import com.imooc.sell.VO.Student;
import com.imooc.sell.VO.aaa;
import com.imooc.sell.repository.BookRepository;
import com.imooc.sell.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("test")
public class Test {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    public void test() {
        Student student = new Student();
        Student student2 = new Student();
        student.setBookId(1);
        student.setStuName("hudong");
        student2.setBookId(2);
        student2.setStuName("hudong2");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);


       List<aaa> a = studentList.stream().map(e -> {
           Book book = bookRepository.findByBookId(e.getBookId());
           return new aaa(book.getBookName(), e.getStall());
       }).collect(Collectors.toList());

        System.out.println("list="+a);

    }


}

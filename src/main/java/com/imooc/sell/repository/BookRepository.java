package com.imooc.sell.repository;

import com.imooc.sell.VO.Book;
//import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book,Integer> {

    //@Query("select * ")
    Book findByBookId(Integer id);
}

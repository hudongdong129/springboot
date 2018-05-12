package com.imooc.sell.VO;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {

    @Id
    private Integer bookId; //book_id

    private String bookName;

    private String price;
}

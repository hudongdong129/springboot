package com.imooc.sell.VO;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
public class Student {

    @Id
    private Integer id;

    private String stuName;

    private Integer bookId;

    private String stall;

}

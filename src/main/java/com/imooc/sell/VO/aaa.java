package com.imooc.sell.VO;

public class aaa {

    public aaa(String name, String price) {
        this.name = name;
        this.price = price;
    }

    private String name;

    private String price;

    @Override
    public String toString() {
        return "aaa{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

package kr.or.kftc.sample.my;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
    public MyDao() {
        System.out.println("constructor inited");
    }

    public String crud() {
        Book book = new Book(123, "aaa", 123.123, "Brook");
        book.setId(12);
        return "crud method called" + book;
    }
}

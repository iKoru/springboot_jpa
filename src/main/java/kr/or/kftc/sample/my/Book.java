package kr.or.kftc.sample.my;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Book {
    private int id;
    private String title;
    private double price;
    private String writer;
}
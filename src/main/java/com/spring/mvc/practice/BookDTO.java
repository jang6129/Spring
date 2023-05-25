package com.spring.mvc.practice;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class BookDTO {
    /* 제목, 저자, 출판사, 출판일 */
    String title;
    String author;
    String publisher;
    LocalDate date;

    public BookDTO(String t, String a, String p, LocalDate d) {
        title = t;
        author = a;
        publisher = p;
        date = d;
    }
}

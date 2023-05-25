package com.spring.mvc.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CableDTO {
    private String name = "default cable";
    private String type = "c";
    private String rate = "1.0";
    private int length = 120;
    private int price = 5000;
}

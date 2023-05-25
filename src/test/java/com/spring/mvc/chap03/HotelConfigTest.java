package com.spring.mvc.chap03;

import com.spring.mvc.chap03.config.HotelConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HotelConfigTest {

    AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(HotelConfig.class);

    @Test
    void springDITest() {
        Hotel hotel = ac.getBean(Hotel.class);
        hotel.inform();

        Chef koreanChef = ac.getBean(KoreanChef.class);
        koreanChef.cook();
    }



}

package com.spring.mvc.practice;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@org.springframework.stereotype.Controller
@RequestMapping("/practice")
public class Controller {

    @GetMapping("submit")
    public String submit() {
        return "/practice/form";
    }

    @PostMapping("publish")
    public String publish(
            @RequestParam("title") String t,
            @RequestParam("author") String a,
            @RequestParam("publisher") String p,
            @RequestParam("date")LocalDate d,
            Model model
            ) {
        BookDTO book = new BookDTO(t, a, p, d);
        model.addAttribute("book", book);

        return "/practice/release";
    }

    @PostMapping("publish2")
    public ModelAndView publish(
            @RequestParam("title") String t,
            @RequestParam("author") String a,
            @RequestParam("publisher") String p,
            @RequestParam("date")LocalDate d
    ) {
        BookDTO book = new BookDTO(t, a, p, d);
        ModelAndView mv = new ModelAndView();
        mv.addObject("book", book);
        mv.setViewName("/practice/release");

        return mv;
    }

}

package com.spring.mvc.controller02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/chap02")
public class MVCController02 {

    @RequestMapping("hobbies")
    public String hobbies(Model model) {
        String name = "룰루";

        List<String> hobbies = List.of(
                "밥먹기",
                "낮잠자기",
                "쥐잡기"
        );

        model.addAttribute("n", name);
        model.addAttribute("hList", hobbies);

        return "/chap02/hobbies";
    }

    @RequestMapping("/example")
    public ModelAndView example() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "John");
        modelAndView.addObject("age", List.of(10, 30, 20));
        modelAndView.setViewName("chap02/example");

        return modelAndView;
    }
}

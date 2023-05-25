package com.spring.mvc.controller03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.Map;

@Controller
@RequestMapping("/chap03")
public class MVCController03 {

    @GetMapping("/foodform")
    public String foodForm() {
        return "/chap03/foodform";
    }

    @PostMapping("/foodorder")
    public ModelAndView foodOrder(String name, int number, String menu) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("number", number);
        mv.addObject("menu", menu);
        mv.setViewName("chap03/foodresult");

        return mv;
    }

    @GetMapping("checkform")
    public String checkForm() {
        return "/chap03/checkform";
    }

    @PostMapping("/check")
    public String check(@RequestParam("menu") String menu, @RequestParam("price") String price, Model model) {
        model.addAttribute("menu", menu);
        model.addAttribute("price", price);

        return "/chap03/checkresult";
    }

}

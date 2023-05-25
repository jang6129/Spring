package com.spring.mvc.controller01;

import com.spring.mvc.DTO.CableDTO;
import com.spring.mvc.DTO.NotebookDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MVCController01 {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("/hello access");
        return "hello";
    }

    @GetMapping("/getreq")
    public String getReq() {
        System.out.println("get() access");

        return "reqview";
    }

    @RequestMapping("/person")
    public String person(HttpServletRequest request) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        System.out.println("name : " + name);
        System.out.println("age : " + age);

        return "";
    }

    @RequestMapping("/major")
    public String major(@RequestParam(defaultValue = "student") String stu, double gpa, double gpa2) {
        System.out.println(stu + " : " + (gpa + gpa2));

        return "";
    }

    @RequestMapping("notebook")
    public String notebook(NotebookDTO notebook) {
        System.out.println(notebook);

        return "";
    }

    @RequestMapping("cable")
    public String cable(CableDTO cable) {
        System.out.println(cable);

        return "";
    }

    @RequestMapping("/board/{bNo}")
    public String board(@PathVariable int bNo) {
        System.out.println("bNo : " + bNo);

        return "";
    }

    @RequestMapping("/member/{mName}/{mNo}")
    public String member(@PathVariable String mName, @PathVariable int mNo) {
        System.out.println("name : " + mName);
        System.out.println("number : " + mNo);

        return "";
    }

    @RequestMapping("/catform")
    public String catForm() {
        System.out.println("고양이 -> Form");

        return "/chap01/catform";
    }

    @RequestMapping("/cat")
    public String cat(String name, int age, String kind) {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("종 : " + kind);

        return "/chap01/catreg";
    }

    @GetMapping("/loginform")
    public String loginFrom() {
        System.out.println("로그인 폼 작성");

        return "/chap01/loginform";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String login(String id, String pw) {
        System.out.println("ID : " + id);
        System.out.println("PW : " + pw);

        return "/chap01/loginreg";
    }


}

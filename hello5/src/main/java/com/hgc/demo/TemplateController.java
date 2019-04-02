package com.hgc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class TemplateController {
    @RequestMapping("/guimei")
    public String toGuiMei(){
        return "CSS-guimei";
    }
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("hello","hello thymeleaf");
        Person person=new Person();
        person.setUsername("zcs");
        person.setPassword("fjafk");
        person.setBirth(new Date());
        person.setGender(true);
        model.addAttribute("p",person);
        List<Person> list=new ArrayList<Person>();
        for (int i = 0; i < 10; i++) {
            Person person1=new Person();
            person.setUsername("zcs"+i);
            person.setPassword("fjafk"+i);
            person.setBirth(new Date());
            list.add(person1);
        }
        model.addAttribute("list",list);
        return "test";
    }

    @RequestMapping("/test1")
    public String test1(Model model, HttpSession session){
        Person person=new Person();
        person.setUsername("腾讯课堂");
        person.setPassword("123456");
        person.setBirth(new Date());
        session.setAttribute("p",person);
        return "test1";
    }
}

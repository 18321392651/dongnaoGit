package com.ddw.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@SpringBootApplication
public class Demo72Application {

    @RequestMapping("/")
    public String index(Model model) {
        Person person = new Person("a1", 10);
        model.addAttribute("person", person);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(Demo72Application.class, args);
    }

}


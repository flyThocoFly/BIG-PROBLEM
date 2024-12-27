package com.zaurtregulov.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @GetMapping(value = "/")
    public String showFirstView() {
        System.out.println("124");
        System.out.println("124");
        System.out.println("124");
        System.out.println("124");
        return "first-view";
    }
}

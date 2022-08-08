package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping
    public ModelAndView showHomePage() {
        System.out.println("43t235t254");
        return new ModelAndView("/home");
    }

    public void testConflict() {
        System.out.println("Conflict");
        System.out.println("To test conflict");
    }
}

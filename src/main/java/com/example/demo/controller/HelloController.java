package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("/hello")
  public String hello(Model model) { // Spring will inject the Model object into the method
    model.addAttribute("data", "hello!!");

    // resources/templates/hello.html will be rendered
    // ViewResolver will resolve the view name to the template file
    return "hello";
  }
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
  HelloController() {
    System.out.println("HelloController() called");
  }

  @GetMapping("/hello")
  public String hello(Model model, @RequestParam("name") String name) { // Spring will inject the Model object into the
                                                                        // method
    model.addAttribute("data", "hello!! " + name);

    // resources/templates/hello.html will be rendered
    // ViewResolver will resolve the view name to the template file
    return "hello";
  }

  @GetMapping("/hello-api")
  @ResponseBody // Don't use ViewResolver, just return the object as JSON
  // HttpMessageConvertor will convert the object to JSON, (with StringConverter
  // and JsonConverter)
  public Hello helloApi(@RequestParam("name") String name) {
    Hello hello = new Hello();
    hello.setName(name);

    return hello;
  }

  static class Hello {
    private String name;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}

package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGlobalController {

  @GetMapping("/message")
  public String restGlobal() {
    return "here is message";
  }
}

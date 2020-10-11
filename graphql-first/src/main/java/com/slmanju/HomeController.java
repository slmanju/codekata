package com.slmanju;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping(value = { "", "/" })
  public String index() {
    return "Hello";
  }

}

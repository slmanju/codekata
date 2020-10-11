package com.slmanju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.slmanju" })
public class GraphqlApplication {

  public static void main(String[] args) {
    SpringApplication.run(GraphqlApplication.class, args);
  }

}

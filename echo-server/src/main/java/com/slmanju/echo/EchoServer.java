package com.slmanju.echo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.slmanju" })
public class EchoServer {

  public static void main(String[] args) {
    SpringApplication.run(EchoServer.class, args);
  }

}

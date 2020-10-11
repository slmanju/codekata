package com.slmanju.echo;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class EchoController {

  @GetMapping(value = { "", "/", "/**" })
  public Echo echo() {
    try {
      InetAddress localHost = InetAddress.getLocalHost();
      return Echo.builder().hostAddress(localHost.getHostAddress()).hostName(localHost.getHostName()).build();
    } catch (UnknownHostException e) {
      return Echo.builder().build();
    }
  }

  @Getter @Builder
  static class Echo {
    private final String name = "Echo Server";
    private String hostAddress;
    private String hostName;
  }

}

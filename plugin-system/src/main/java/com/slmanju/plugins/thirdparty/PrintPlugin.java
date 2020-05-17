package com.slmanju.plugins.thirdparty;

import com.slmanju.plugins.api.Plugin;

public class PrintPlugin implements Plugin {

  @Override
  public void run() {
    System.out.println("run third party print plugin");
  }

  @Override
  public String id() {
    return "com.slmanju.thirdparty";
  }

  @Override
  public String name() {
    return "Print";
  }

}

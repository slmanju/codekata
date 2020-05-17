package com.slmanju.plugins.menus;

import com.slmanju.plugins.api.Plugin;

public class OpenPlugin implements Plugin {

  @Override
  public void run() {
    System.out.println("run open plugin");
  }

  @Override
  public String id() {
    return "com.slmanju.OpenPlugin";
  }

  @Override
  public String name() {
    return "Open";
  }

}

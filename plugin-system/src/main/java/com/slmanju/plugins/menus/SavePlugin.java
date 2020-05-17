package com.slmanju.plugins.menus;

import com.slmanju.plugins.api.Plugin;

public class SavePlugin implements Plugin {

  @Override
  public void run() {
    System.out.println("run save plugin");
  }

  @Override
  public String id() {
    return "com.slmanju.SavePlugin";
  }

  @Override
  public String name() {
    return "Save";
  }

}

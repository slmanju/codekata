package com.slmanju.plugins;

import com.slmanju.plugins.api.Plugin;
import com.slmanju.plugins.api.PluginPlatform;

public class PluginApplication {

  public static void main(String[] args) {
    PluginPlatform.getInstance().bootstrap();

    PluginPlatform.getInstance().plugins().forEach(plugin -> {
      System.out.println("************************");
      System.out.println(plugin.id());
      System.out.println(plugin.name());
      plugin.run();
    });

    System.out.println("--------------------");
    Plugin plugin = PluginPlatform.getInstance().plugin("com.slmanju.SavePlugin");
    plugin.run();
  }

}

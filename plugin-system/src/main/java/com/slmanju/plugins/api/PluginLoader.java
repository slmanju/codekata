package com.slmanju.plugins.api;

import com.slmanju.plugins.menus.OpenPlugin;
import com.slmanju.plugins.menus.SavePlugin;
import com.slmanju.plugins.thirdparty.PrintPlugin;

class PluginLoader {

  private PluginRegistry pluginRegistry = PluginRegistry.getInstance();

  void load() {
    pluginRegistry.register(new OpenPlugin());
    pluginRegistry.register(new SavePlugin());
    pluginRegistry.register(new PrintPlugin());
  }

}

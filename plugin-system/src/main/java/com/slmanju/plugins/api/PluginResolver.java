package com.slmanju.plugins.api;

import java.util.List;

class PluginResolver {

  private PluginRegistry pluginRegistry = PluginRegistry.getInstance();

  Plugin resolve(String id) {
    return pluginRegistry.resolve(id);
  }

  List<Plugin> plugins() {
    return pluginRegistry.plugins();
  }

}

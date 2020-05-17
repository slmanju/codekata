package com.slmanju.plugins.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PluginRegistry {

  private Map<String, Plugin> plugins = new HashMap<>();

  private final static PluginRegistry INSTANCE = new PluginRegistry();

  private PluginRegistry() {}

  static PluginRegistry getInstance() {
    return INSTANCE;
  }

  void register(Plugin plugin) {
    plugins.put(plugin.id(), plugin);
  }

  Plugin resolve(String id) {
    return plugins.get(id);
  }

  List<Plugin> plugins() {
    return new ArrayList<>(plugins.values());
  }

}

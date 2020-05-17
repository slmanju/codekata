package com.slmanju.plugins.api;

import java.util.List;

public final class PluginPlatform {

  private PluginLoader pluginLoader = new PluginLoader();
  private PluginResolver pluginResolver = new PluginResolver();
  private static final PluginPlatform INSTANCE = new PluginPlatform();

  public static PluginPlatform getInstance() {
    return INSTANCE;
  }

  public void bootstrap() {
    pluginLoader.load();
  }

  public Plugin plugin(String id) {
    return pluginResolver.resolve(id);
  }

  public List<Plugin> plugins() {
    return pluginResolver.plugins();
  }

}

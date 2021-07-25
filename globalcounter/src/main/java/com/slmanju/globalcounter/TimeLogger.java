package com.slmanju.globalcounter;

public class TimeLogger {

  public static void log(Loggable loggable) throws Exception {
    long start = System.currentTimeMillis();
    loggable.log();
    long end = System.currentTimeMillis();
    System.out.println("--- TIME: " + (end - start));
  }

  @FunctionalInterface
  interface Loggable {
    void log() throws Exception;
  }

}

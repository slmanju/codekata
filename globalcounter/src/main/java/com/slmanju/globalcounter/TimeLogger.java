package com.slmanju.globalcounter;

public class TimeLogger {

  public static void log(Loggable loggable) throws Exception {
    long start = System.currentTimeMillis();
    long value = loggable.log();
    long end = System.currentTimeMillis();
    System.out.println(value + " --- TIME: " + (end - start));
  }

  @FunctionalInterface
  interface Loggable {
    long log() throws Exception;
  }

}

package com.slmanju.dip.sub;

import com.slmanju.dip.main.FileWriter;

public class SimpleFileWriter implements FileWriter {

  public void write() {
    System.out.println("Writing file to local file system.");
  }

}

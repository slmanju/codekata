package com.slmanju.dip.main;

public class FileProcessorImpl implements FileProcessor {

  private final FileWriter fileWriter;

  public FileProcessorImpl(FileWriter fileWriter) {
    this.fileWriter = fileWriter;
  }

  public void process() {
    System.out.println("loading data...");
    System.out.println("calculating values...");
    System.out.println("writing data into a file...");

    fileWriter.write();
  }

}

package com.slmanju.dip;

import com.slmanju.dip.main.FileProcessor;
import com.slmanju.dip.main.FileProcessorImpl;
import com.slmanju.dip.sub.AwsFileWriter;
import com.slmanju.dip.sub.SimpleFileWriter;

public class App {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessorImpl(new SimpleFileWriter());
    fileProcessor.process();

    fileProcessor = new FileProcessorImpl(new AwsFileWriter());
    fileProcessor.process();
  }

}

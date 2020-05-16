package com.slmanju.dip.sub;

import com.slmanju.dip.main.FileWriter;

public class AwsFileWriter implements FileWriter {

  public void write() {
    System.out.println("Writing to S3 bucket.");
  }

}

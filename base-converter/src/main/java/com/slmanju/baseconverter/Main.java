package com.slmanju.baseconverter;

public class Main {

  public static void main(String[] args) {
    BaseEncoder base16 = Base10Encoder.BASE_62;
    long start = System.currentTimeMillis();
    String encode = base16.encode(Long.MAX_VALUE);
    long end = System.currentTimeMillis();
    System.out.println(encode);

    System.out.println(base16.decode(encode));

    System.out.println(end - start);
  }
}

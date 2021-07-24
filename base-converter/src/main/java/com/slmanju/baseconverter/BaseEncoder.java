package com.slmanju.baseconverter;

public interface BaseEncoder {

  String encode(long number);

  long decode(String number);

}

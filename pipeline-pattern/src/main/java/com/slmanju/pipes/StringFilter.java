package com.slmanju.pipes;

class StringFilter implements Filter<String, String> {

  @Override
  public String execute(String input) {
    return input.replaceAll("\\s","");
  }

}

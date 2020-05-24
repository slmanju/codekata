package com.slmanju.pipes;

class FloatFilter implements Filter<String, Float> {

  @Override
  public Float execute(String input) {
    return Float.valueOf(input);
  }

}

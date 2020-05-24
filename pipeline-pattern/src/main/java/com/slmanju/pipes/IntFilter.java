package com.slmanju.pipes;

class IntFilter implements Filter<Float, Integer> {

  @Override
  public Integer execute(Float input) {
    return input.intValue();
  }

}

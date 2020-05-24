package com.slmanju.pipes;

public class PipelineManager {

  public Integer process(String input) {
    Pipeline<String, Integer> pipeline = new Pipeline<>(new StringFilter())
        .pipe(new FloatFilter())
        .pipe(new IntFilter());

    return pipeline.process(input);
  }

}

package com.slmanju;

import com.slmanju.pipes.PipelineManager;

public class App {

  public static void main(String[] args) {
    PipelineManager pipelineManager = new PipelineManager();
    System.out.println(pipelineManager.process("1 2 3 .56"));
  }

}

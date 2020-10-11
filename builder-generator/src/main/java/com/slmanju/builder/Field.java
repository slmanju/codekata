package com.slmanju.builder;

import lombok.Builder;

@Builder
public class Field {

  private String name;
  private String type;
  private Class<?> clazz;

}

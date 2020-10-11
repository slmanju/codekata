package com.slmanju;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Book {

  private String id;
  private String name;

}

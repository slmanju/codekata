package com.slmanju.leaves.values;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Id implements Serializable {

  private Long id;

  public static Id of(Long value) {
    return new Id(value);
  }

}

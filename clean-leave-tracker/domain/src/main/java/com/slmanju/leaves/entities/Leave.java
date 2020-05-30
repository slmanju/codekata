package com.slmanju.leaves.entities;

import com.slmanju.leaves.values.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
public class Leave {

  private Id id;
  private int numberOfDays;
  private String reason;
  private LocalDate fromDate;
  private LocalDate toDate;

}

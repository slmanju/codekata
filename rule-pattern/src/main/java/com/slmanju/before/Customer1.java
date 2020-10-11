package com.slmanju.before;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer1 {

  private LocalDate dateOfFirstPurchase;
  private LocalDate dateOfBirth;
  private boolean isVeteran;

}

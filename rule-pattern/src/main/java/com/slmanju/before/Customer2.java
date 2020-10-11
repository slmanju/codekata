package com.slmanju.before;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Customer2 {

  private LocalDate dateOfFirstPurchase;
  private LocalDate dateOfBirth;
  private boolean isVeteran;

  public boolean isBirthday() {
    return MonthDay.from(dateOfBirth).compareTo(MonthDay.from(LocalDate.now())) == 0;
  }

  public boolean isSeniorCitizen() {
    return dateOfBirth.plusYears(65).isBefore(LocalDate.now());
  }

  public boolean hasBeenLoyalForYears(int years) {
    return ChronoUnit.YEARS.between(dateOfFirstPurchase, LocalDate.now()) >= years;
  }

  public boolean isMember() {
    return Objects.nonNull(dateOfFirstPurchase);
  }

}

package com.slmanju.before;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class DiscountCalculator1 {

  public int calculateDiscount(Customer1 customer) {
    int discount = 0;
    if (customer.getDateOfBirth().plusYears(65).isBefore(LocalDate.now())) {
      // senior discount 5%
      discount = 5;
    }

    if (customer.isVeteran()) {
      // veterans get 10%
      discount = Math.max(discount, 10);
    }

    if (MonthDay.from(customer.getDateOfBirth()).compareTo(MonthDay.from(LocalDate.now())) == 0) {
      // birthday 10%
      discount = Math.max(discount, 10);
    }

    if (Objects.nonNull(customer.getDateOfFirstPurchase())) {
      if (ChronoUnit.YEARS.between(customer.getDateOfFirstPurchase(), LocalDate.now()) >= 1) {
        // after 1 year, loyal customers get 10%
        discount = Math.max(discount, 10);

        if (Period.between(customer.getDateOfFirstPurchase(), LocalDate.now()).getYears() >= 5) {
          // after 5 years, 12%
          discount = Math.max(discount, 12);
          if (Period.between(customer.getDateOfFirstPurchase(), LocalDate.now()).getYears() >= 10) {
            // after 10 years, 20%
            discount = Math.max(discount, 20);
          }
        }

        if (MonthDay.from(customer.getDateOfBirth()).compareTo(MonthDay.from(LocalDate.now())) == 0) {
          // birthday additional 10%
          discount += 10;
        }
      }
    } else {
      // first time purchase discount of 15%
      discount = Math.max(discount, 15);
    }

    return discount;
  }

}

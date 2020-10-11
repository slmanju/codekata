package com.slmanju.rules;

public class BirthdayDiscountRule implements DiscountRule {

  @Override
  public int calculate(Customer customer) {
    return customer.isBirthday() ? 10 : 0;
  }

}

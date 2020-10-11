package com.slmanju.rules;

public class VeteranDiscountRule implements DiscountRule {

  @Override
  public int calculate(Customer customer) {
    return customer.isVeteran() ? 10 : 0;
  }

}

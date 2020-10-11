package com.slmanju.rules;

public class SeniorCitizenDiscountRule implements DiscountRule {

  @Override
  public int calculate(Customer customer) {
    return customer.isSeniorCitizen() ? 5 : 0;
  }

}

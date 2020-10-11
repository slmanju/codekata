package com.slmanju.rules;

public class NewCustomerDiscountRule implements DiscountRule {

  @Override
  public int calculate(Customer customer) {
    return customer.isMember() ? 0 : 15;
  }

}

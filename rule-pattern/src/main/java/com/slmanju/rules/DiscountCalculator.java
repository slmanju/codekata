package com.slmanju.rules;

import java.util.ArrayList;
import java.util.List;

public class DiscountCalculator {

  private List<DiscountRule> discountRules = new ArrayList<>();

  public DiscountCalculator() {
    discountRules.add(new SeniorCitizenDiscountRule());
    discountRules.add(new VeteranDiscountRule());
    discountRules.add(new BirthdayDiscountRule());
    discountRules.add(new LoyaltyDiscountRule(1, 10));
    discountRules.add(new LoyaltyDiscountRule(5, 12));
    discountRules.add(new LoyaltyDiscountRule(10, 20));
    discountRules.add(new NewCustomerDiscountRule());
  }

  public int calculateDiscount(Customer customer) {
    int discount = 0;
    for (DiscountRule discountRule : discountRules) {
      discount = Math.max(discountRule.calculate(customer), discount);
    }
    return discount;
  }

}

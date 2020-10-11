package com.slmanju.rules;

public class LoyaltyDiscountRule implements DiscountRule {

  private int years;
  private int discount;
  private DiscountRule birthdayDiscountRule;

  LoyaltyDiscountRule(int years, int discount) {
    this.years = years;
    this.discount = discount;
    this.birthdayDiscountRule = new BirthdayDiscountRule();
  }

  @Override
  public int calculate(Customer customer) {
    int value = 0;
    if (customer.hasBeenLoyalForYears(years)) {
      value = discount + birthdayDiscountRule.calculate(customer);
    }
    return value;
  }

}

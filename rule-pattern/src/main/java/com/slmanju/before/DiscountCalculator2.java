package com.slmanju.before;

public class DiscountCalculator2 {

  public int calculateDiscount(Customer2 customer) {
    int discount = 0;
    if (customer.isSeniorCitizen()) {
      discount = 5;
    }

    if (customer.isVeteran()) {
      discount = Math.max(discount, 10);
    }

    if (customer.isBirthday()) {
      discount = Math.max(discount, 10);
    }

    if (customer.isMember()) {
      if (customer.hasBeenLoyalForYears(1)) {
        discount = Math.max(discount, 10);

        if (customer.hasBeenLoyalForYears(5)) {
          discount = Math.max(discount, 12);
          if (customer.hasBeenLoyalForYears(10)) {
            discount = Math.max(discount, 20);
          }
        }

        if (customer.isBirthday()) {
          discount += 10;
        }
      }
    } else {
      discount = Math.max(discount, 15);
    }

    return discount;
  }

}

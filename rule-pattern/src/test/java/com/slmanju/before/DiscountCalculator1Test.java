package com.slmanju.before;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DiscountCalculator1Test {

  @Test
  public void testDiscount_whenFirstTimePurchase() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.of(1983, 10, 13))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(15, discount);
  }

  @Test
  public void testDiscount_whenSeniorCitizen() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.of(1950, 10, 13))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(5, discount);
  }

  @Test
  public void testDiscount_whenVeteran() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.of(1950, 10, 13))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .isVeteran(true)
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenBirthday() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenPurchasedYearAgo() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(1))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenPurchasedYearAgoAnBirthDay() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(1))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(20, discount);
  }

  @Test
  public void testDiscount_whenPurchased5YearAgo() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(5))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(12, discount);
  }

  @Test
  public void testDiscount_whenPurchased5YearAgoAndBirthDay() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(5))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(22, discount);
  }

  @Test
  public void testDiscount_whenPurchased10YearAgo() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(10))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(20, discount);
  }

  @Test
  public void testDiscount_whenPurchased10YearAgoAndBirthDay() {
    DiscountCalculator1 calculator = new DiscountCalculator1();
    Customer1 customer = Customer1.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(10))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(30, discount);
  }

}

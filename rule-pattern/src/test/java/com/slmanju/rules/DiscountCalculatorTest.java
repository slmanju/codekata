package com.slmanju.rules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DiscountCalculatorTest {

  @Test
  public void testDiscount_whenFirstTimePurchase() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.of(1983, 10, 13))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(15, discount);
  }

  @Test
  public void testDiscount_whenSeniorCitizen() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.of(1950, 10, 13))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(5, discount);
  }

  @Test
  public void testDiscount_whenVeteran() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.of(1950, 10, 13))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .isVeteran(true)
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenBirthday() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusMonths(6))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenPurchasedYearAgo() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(1))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(10, discount);
  }

  @Test
  public void testDiscount_whenPurchasedYearAgoAnBirthDay() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(1))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(20, discount);
  }

  @Test
  public void testDiscount_whenPurchased5YearAgo() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(5))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(12, discount);
  }

  @Test
  public void testDiscount_whenPurchased5YearAgoAndBirthDay() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(5))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(22, discount);
  }

  @Test
  public void testDiscount_whenPurchased10YearAgo() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30).minusMonths(5))
        .dateOfFirstPurchase(LocalDate.now().minusYears(10))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(20, discount);
  }

  @Test
  public void testDiscount_whenPurchased10YearAgoAndBirthDay() {
    DiscountCalculator calculator = new DiscountCalculator();
    Customer customer = Customer.builder()
        .dateOfBirth(LocalDate.now().minusYears(30))
        .dateOfFirstPurchase(LocalDate.now().minusYears(10))
        .build();
    int discount = calculator.calculateDiscount(customer);

    Assertions.assertEquals(30, discount);
  }

}

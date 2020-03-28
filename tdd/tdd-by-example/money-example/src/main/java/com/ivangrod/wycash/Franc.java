package com.ivangrod.wycash;

public class Franc extends Money {

  public Franc(int amount, String curency) {
    this.amount = amount;
    this.currency = "CHF";
  }

  public Money times(int multiplier) {
    return Money.franc(multiplier);
  }
}

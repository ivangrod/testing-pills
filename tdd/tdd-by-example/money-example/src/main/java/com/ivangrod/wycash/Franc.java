package com.ivangrod.wycash;

public class Franc extends Money {

  public Franc(int amount, String curency) {
    this.amount = amount;
    this.currency = "CHF";
  }

  public Money times(int multiplier) {
    return new Franc(amount * multiplier, null);
  }
}

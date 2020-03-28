package com.ivangrod.wycash;

public abstract class Money {

  protected int amount;
  protected String currency;

  public static Money dollar(int amount) {
    return new Dollar(amount);
  }

  public static Money franc(int amount) {
    return new Franc(amount, null);
  }

  public String currency(){
    return currency;
  };

  public abstract Money times(int multiplier);

  @Override
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && getClass().equals(money.getClass());
  }
}

package com.ivangrod;

public class Year {

  private int year;

  public Year(int year) {
    this.year = year;
  }

  public boolean isLeap() {
    if(year == 1800) return false;
    return isDivisibleBy(4) || isDivisibleBy(400);
  }

  private boolean isDivisibleBy(int divisor) {
    return year % divisor == 0;
  }
}

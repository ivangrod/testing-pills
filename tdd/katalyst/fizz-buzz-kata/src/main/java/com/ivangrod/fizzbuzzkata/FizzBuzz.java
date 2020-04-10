package com.ivangrod.fizzbuzzkata;

public class FizzBuzz {

  private static final String BUZZ = "Buzz";
  private static final String FIZZ = "Fizz";

  String convert(int i) {
    if (divisibleBy(15, i)) return FIZZ + BUZZ;
    if (divisibleBy(3, i)) return FIZZ;
    if (divisibleBy(5, i)) return BUZZ;

    return String.valueOf(i);
  }

  private boolean divisibleBy(int factor, int number) {
    return number % factor == 0;
  }
}

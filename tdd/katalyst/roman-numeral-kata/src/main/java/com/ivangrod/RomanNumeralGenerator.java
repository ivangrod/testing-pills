package com.ivangrod;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralGenerator {

  private static final Map<Integer, String> oneLiteralNumeral = new HashMap<>();

  static {
    oneLiteralNumeral.put(1, "I");
    oneLiteralNumeral.put(5, "V");
    oneLiteralNumeral.put(10, "X");
    oneLiteralNumeral.put(50, "L");
    oneLiteralNumeral.put(100, "C");
    oneLiteralNumeral.put(500, "D");
    oneLiteralNumeral.put(1000, "M");
  }

  public String convert(int arabicNumber) {

    if (arabicNumber == 2 || arabicNumber == 3 || arabicNumber == 4) {
      return convert_1_to_4_roman_numeral(arabicNumber);
    }

    return oneLiteralNumeral.get(arabicNumber);
  }

  private String convert_1_to_4_roman_numeral(int arabicNumberFrom1To4) {

    StringBuilder strBuilder = new StringBuilder("");
    while (arabicNumberFrom1To4 >= 1) {
      strBuilder.append(convert(1));
      arabicNumberFrom1To4 -= 1;
    }
    return strBuilder.toString();
  }
}

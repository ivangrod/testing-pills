package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralGeneratorShould {

  @Test
  public void convert_1_arabic_number_to_I_roman_numeral() {
    assertThat("I", equalTo(romanNumeral(1)));
  }

  @Test
  public void convert_2_arabic_number_to_II_roman_numeral() {
    assertThat("II", equalTo(romanNumeral(2)));
  }

  @Test
  public void convert_3_arabic_number_to_III_roman_numeral() {
    assertThat("III", equalTo(romanNumeral(3)));
  }

  @Test
  public void convert_4_arabic_number_to_IIII_roman_numeral() {
    assertThat("IIII", equalTo(romanNumeral(4)));
  }

  @Test
  public void convert_5_arabic_number_to_V_roman_numeral() {
    assertThat("V", equalTo(romanNumeral(5)));
  }

  @Test
  public void convert_10_arabic_number_to_X_roman_numeral() {
    assertThat("X", equalTo(romanNumeral(10)));
  }

  @Test
  public void convert_50_arabic_number_to_L_roman_numeral() {
    assertThat("L", equalTo(romanNumeral(50)));
  }

  @Test
  public void convert_100_arabic_number_to_C_roman_numeral() {
    assertThat("C", equalTo(romanNumeral(100)));
  }

  @Test
  public void convert_500_arabic_number_to_D_roman_numeral() {
    assertThat("D", equalTo(romanNumeral(500)));
  }

  @Test
  public void convert_1000_arabic_number_to_M_roman_numeral() {
    assertThat("M", equalTo(romanNumeral(1000)));
  }

  private String romanNumeral(int arabicNumber) {
    return new RomanNumeralGenerator().convert(arabicNumber);
  }
}

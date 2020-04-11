package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RomanNumeralGeneratorShould {

  @Test
  public void convert_1_arabic_number_to_I_roman_numeral() {
    assertThat(romanNumeral(1), equalTo("I"));
  }

  @Test
  public void convert_2_arabic_number_to_II_roman_numeral() {
    assertThat(romanNumeral(2), equalTo("II"));
  }

  @Test
  public void convert_3_arabic_number_to_III_roman_numeral() {
    assertThat(romanNumeral(3), equalTo("III"));
  }

  @Test
  public void convert_4_arabic_number_to_IIII_roman_numeral() {
    assertThat(romanNumeral(4), equalTo("IIII"));
  }

  @Test
  public void convert_5_arabic_number_to_V_roman_numeral() {
    assertThat(romanNumeral(5), equalTo("V"));
  }

  @Test
  public void convert_6_arabic_number_to_VI_roman_numeral() {
    assertThat(romanNumeral(6), equalTo("VI"));
  }

  @Test
  public void convert_7_arabic_number_to_VII_roman_numeral() {
    assertThat(romanNumeral(7), equalTo("VII"));
  }

  @Test
  public void convert_8_arabic_number_to_VIII_roman_numeral() {
    assertThat(romanNumeral(8), equalTo("VIII"));
  }

  @Test
  public void convert_10_arabic_number_to_X_roman_numeral() {
    assertThat(romanNumeral(10), equalTo("X"));
  }

  @Test
  public void convert_50_arabic_number_to_L_roman_numeral() {
    assertThat(romanNumeral(50), equalTo("L"));
  }

  @Test
  public void convert_100_arabic_number_to_C_roman_numeral() {
    assertThat(romanNumeral(100), equalTo("C"));
  }

  @Test
  public void convert_500_arabic_number_to_D_roman_numeral() {
    assertThat(romanNumeral(500), equalTo("D"));
  }

  @Test
  public void convert_1000_arabic_number_to_M_roman_numeral() {
    assertThat(romanNumeral(1000), equalTo("M"));
  }

  private String romanNumeral(int arabicNumber) {
    return new RomanNumeralGenerator().convert(arabicNumber);
  }
}

package com.ivangrod;

public class MiddleCharacter {

  public String getMiddle(String word) {

    if (word.length() % 2 == 0) {
      return getMiddleCharPrevious(word).concat(getMiddleChar(word));
    }

    return getMiddleChar(word);
  }

  private String getMiddleChar(String word) {
    return getMiddleCharMinusIndex(word, 0);
  }

  private String getMiddleCharPrevious(String word) {
    return getMiddleCharMinusIndex(word, 1);
  }

  private String getMiddleCharMinusIndex(String word, int index) {
    return Character.toString(word.charAt((word.length() / 2) - index));
  }
}

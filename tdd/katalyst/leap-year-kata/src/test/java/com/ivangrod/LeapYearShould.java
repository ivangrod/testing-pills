package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {

  @Test
  public void year_1997_is_not_leap() {
    assertFalse(new Year(1997).isLeap());
  }

  @Test
  public void year_1996_is_leap() {
    assertTrue(new Year(1996).isLeap());
  }

  @Test
  public void year_1600_is_leap() {
    assertTrue(new Year(1600).isLeap());
  }

  @Test
  public void year_1800_is_leap() {
    assertFalse(new Year(1800).isLeap());
  }
}

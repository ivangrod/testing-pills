package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearShould {

  @Test
  public void year_1997_is_not_leap() {
    assertThat(new Year(1997).isLeap(), is(false));
  }

  @Test
  public void year_1996_is_leap() {
    assertThat(new Year(1996).isLeap(), is(true));
  }

  @Test
  public void year_1600_is_leap() {
    assertThat(new Year(1600).isLeap(), is(true));
  }

  @Test
  public void year_1800_is_not_leap() {
    assertThat(new Year(1800).isLeap(), is(false));
  }
}

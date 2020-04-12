package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TenMinutesWalkShould {

  @Test
  public void validate_walk_too_short() {
    assertThat(validWalk(new char[] {'e'}), equalTo(false));
  }

  @Test
  public void validate_walk_too_long() {
    assertThat(validWalk(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}), equalTo(false));
  }

  @Test
  public void validate_walk_not_finish_at_the_stating_point() {
    assertThat(validWalk(new char[] {'n','n','n','s','n','s','n','s','n','s'}), equalTo(false));
    assertThat(validWalk(new char[] {'n','n','n','w','w','w','n','w','n','w'}), equalTo(false));
  }

  @Test
  public void validate_walk_finish_at_the_stating_point() {
    assertThat(validWalk(new char[] {'n','s','n','s','n','s','n','s','n','s'}), equalTo(true));
    assertThat(validWalk(new char[] {'e','w','e','w','e','w','e','w','e','w'}), equalTo(true));
    assertThat(validWalk(new char[] {'n','e','n','e','s','s','w','s','w','n'}), equalTo(true));
  }

  private boolean validWalk(char[] directions) {
    return TenMinutesWalk.isValid(directions);
  }
}

package com.ivangrod;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class MiddleCharacterShould {

  @Test
  public void return_middle_character_in_odd_words() {
    assertThat(new MiddleCharacter().getMiddle("A"), equalTo("A"));
    assertThat(new MiddleCharacter().getMiddle("testing"), equalTo("t"));
    assertThat(new MiddleCharacter().getMiddle("procedure"), equalTo("e"));
  }

  @Test
  public void return_middle_character_in_even_words() {
    assertThat(new MiddleCharacter().getMiddle("test"), equalTo("es"));
    assertThat(new MiddleCharacter().getMiddle("middle"), equalTo("dd"));
  }
}

package org.ivangrod.testingpills.exception;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;


public class SoldierTests {

    // OLD SCHOOL
    @Test
    public void givenASoldierWithoutSwordWhenHeAttacksAnExceptionIsThrownTryCatch() {

        // ARRANGE: Setup the test fixture
        Soldier soldierWithoutSword = new Soldier.Builder(false, 25).damage(10)
                .defense(12)
                .build();

        Exception caughtException = null;

        // ACT: Call the production code
        try {
            soldierWithoutSword.attack();
        } catch (final Exception exc) {
            caughtException = exc;
        }

        // ASSERT: The outcomes
        assertNotNull(caughtException);
        assertThat(caughtException, new IsInstanceOf(RuntimeException.class));
        assertThat(caughtException.getMessage(), new IsEqual("This soldier can not attack"));

        // ANNIHILATE: Clean up
    }

    //It’s useful approach when we don’t want to test exception details like message and we care only about the type.
    @Test(expected = RuntimeException.class)
    public void givenASoldierWithoutSwordWhenHeAttacksAnExceptionIsThrownExpectedElement() throws RuntimeException {

        Soldier soldierWithoutSword = new Soldier.Builder(false, 25).damage(10)
                .defense(12)
                .build();

        soldierWithoutSword.attack();
    }

    // We have to define assertions in the beginning and invoke method, which will throw an exception after
    // these assertions. It’s different order than in a regular unit test.
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void givenASoldierWithoutSwordWhenHeAttacksAnExceptionIsThrownExpectedException() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage("This soldier can not attack");

        Soldier soldierWithoutSword = new Soldier.Builder(false, 25).damage(10)
                .defense(12)
                .build();

        soldierWithoutSword.attack();
    }

    @Test
    public void givenASoldierWithoutSwordWhenHeAttacksAnExceptionIsThrownAssertJ() {

        final Soldier soldierWithoutSword = new Soldier.Builder(false, 25).damage(10)
                .defense(12)
                .build();

        Throwable thrown = catchThrowable(() -> soldierWithoutSword.attack());

        org.assertj.core.api.Assertions
                .assertThat(thrown)
                .isInstanceOf(RuntimeException.class)
                .hasMessage("This soldier can not attack");
    }
}

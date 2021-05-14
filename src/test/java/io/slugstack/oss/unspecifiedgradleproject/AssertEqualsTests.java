package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertEqualsTests {

    @Test
    void testEqualsWithPrimativeInts() {
        assertEquals(intNotification(), intNotification());
    }

    @Test
    void testEqualsWithObjectIntegers() {
        assertEquals(1, integerNotification());
    }

    @Test
    public void testEqualsWithDoubleNotification() {
        assertEquals(0.0d, doubleNotification(), 0.2d, "These should be close.");
    }

    @Test
    public void testEqualsWithStrings() {
        assertEquals("foo", "foo");
    }

    private Integer integerNotification() {
        return 1;
    }

    private int intNotification() {
        return 1;
    }

    private double doubleNotification() {
        return 0.1d;
    }

}

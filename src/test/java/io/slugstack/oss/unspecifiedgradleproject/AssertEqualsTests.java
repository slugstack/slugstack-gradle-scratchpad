package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertEqualsTests {

    @Test
    void testEqualsWithPrimativeInts() {
        assertEquals(someInt(), someInt());
    }

    @Test
    void testEquals() {
        assertEquals(1, notification());
    }

    private Integer notification() {
        return 1;
    }

    private int someInt() {
        return 1;
    }

}

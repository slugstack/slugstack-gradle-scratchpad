package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertEqualsTests {

    @Test
    void testEquals() {
        assertEquals(1, notification());
    }

    private Integer notification() {
        return 1;
    }

}

package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ExampleTests {

    @Test
    void testEquals() {
        assertEquals(1, notification());
    }

    @Test
    public void testFalse() {
        assertFalse(notification() != null && notification() > 0);
    }

    private Integer notification() {
        return 1;
    }

}

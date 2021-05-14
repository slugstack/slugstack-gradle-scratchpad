package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseWorkingTests {

    @Test
    public void testFalse() {
        assertFalse(notification() != null && notification() > 0);
    }

    @Test
    public void testFalseDirectly() {
        assertFalse(false);
    }

    private Integer notification() {
        return 1;
    }

}

package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseTests {

    @Test
    public void testFalse() {
        assertFalse(notification() != null && notification() > 0);
    }

    private Integer notification() {
        return 1;
    }

}

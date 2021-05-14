package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseFailingTests {

    @Test
    public void testFalseWithMethodCall() {
        assertFalse(isFalse());
    }

    private boolean isFalse() {
        return false;
    }
}

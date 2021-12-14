package io.slugstack.oss.slugstackgradlescratchpad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class AssertFalseFailingTests {

    @Test
    public void testFalseWithMethodCall() {
        assertFalse(isFalse());
    }

    private static boolean isFalse() {
        return false;
    }
}

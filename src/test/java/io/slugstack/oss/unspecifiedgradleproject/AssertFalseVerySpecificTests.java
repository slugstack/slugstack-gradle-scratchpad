package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseVerySpecificTests {

    @Test
    public void testFalseWithMethodCallPain() {
        assertFalse(isFalseMethod());
    }

    private boolean isFalseMethod() {
        return false;
    }

}

package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseFailingTests {

    @Test
    public void testFalseWithMethodCallPrimative() {
        assertFalse(isFalsePrimative());
    }

    @Test
    public void testFalseWithMethodCallObject() {
        assertFalse(isFalseObject());
    }

    private boolean isFalsePrimative() {
        return false;
    }

    private Boolean isFalseObject() {
        return false;
    }
}

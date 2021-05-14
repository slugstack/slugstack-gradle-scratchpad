package io.slugstack.oss.unspecifiedgradleproject;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseTests {

    @Test
    public void testFalse() {
        assertFalse(notification() != null && notification() > 0);
    }

    @Test
    public void testFalseWithMethodCall() {
        assertFalse(isFalse());
    }

    @Test
    public void testFalseWithMethodCallObject() {
        assertFalse(isFalseObject());
    }

    @Test
    public void testFalseDirectly() {
        assertFalse(false);
    }

    private Integer notification() {
        return 1;
    }

    private boolean isFalse() {
        return false;
    }

    private Boolean isFalseObject() {
        return false;
    }

}

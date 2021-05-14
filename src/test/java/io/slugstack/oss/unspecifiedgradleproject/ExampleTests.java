package io.slugstack.oss.unspecifiedgradleproject;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class ExampleTests {

    @Test
    void test() {
        Assertions.assertEquals(1, notification());
    }

    private Integer notification() {
        return 1;
    }

}

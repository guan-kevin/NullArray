package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BazTest {
    @Test
    public void testBar() {
        Baz baz = new Baz();
        baz.start();
    }
}

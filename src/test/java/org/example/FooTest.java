package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FooTest {
    @Test
    public void testFoo() {
        Foo m = new Foo();
        assertTrue(m.returnTrue());
    }
}

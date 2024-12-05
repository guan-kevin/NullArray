package org.example;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FooTest {
    @Test
    public void testFoo() {
        Foo m = new Foo();
        assertTrue(m.returnTrue());

        try {
          Thread.sleep(90000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
    }

    @Test
    public void testFoo2() {
        Foo m = new Foo(2);
        assertTrue(m.returnTrue());
    }
}

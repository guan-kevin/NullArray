package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarTest {
    @Test
    public void testBar() {
        Bar m = new Bar();
        assertEquals(5, m.sort().length);

        try {
          Thread.sleep(90000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
    }
}

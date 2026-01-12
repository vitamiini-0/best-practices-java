package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {
    @Test
    public void testAdd() {
        assertEquals(4, Main.add(1, 3));
    }
}

package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestMain {
  @Test
  public void testAdd() {
    assertEquals(4, Main.add(1, 3));
  }
}

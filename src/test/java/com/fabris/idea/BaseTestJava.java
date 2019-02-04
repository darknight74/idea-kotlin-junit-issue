package com.fabris.idea;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

abstract class BaseTestJava {

    @Test
    public void testMultiply() {
        assertEquals(6, 3*2);
    }

    @Nested
    @DisplayName("Java Divide")
    class Divide {

        @Test
        public void testDivide() {
            assertEquals(3, 6/2);
        }
    }
}

package com.fabris.idea;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RealTestJava extends BaseTestJava {

    @Test
    public void testAdd() {
        assertEquals(5, 3+2);
    }
}

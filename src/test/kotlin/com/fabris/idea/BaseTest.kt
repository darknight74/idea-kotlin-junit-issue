package com.fabris.idea

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

open class BaseTest {

    @Test
    fun testMultiply() {
        assertEquals(6, 2*3)
    }

    @Nested
    @DisplayName("Divide")
    inner class Divide {

        @Test
        fun testDivide() {
            assertEquals(3, 6/2)
        }
    }
}
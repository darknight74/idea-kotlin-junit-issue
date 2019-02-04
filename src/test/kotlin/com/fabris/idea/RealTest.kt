package com.fabris.idea

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class RealTest:BaseTest() {

    @Test
    fun testAdd() {
        assertEquals(5, 3+2)
    }
}
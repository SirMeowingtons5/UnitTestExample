package com.sirmeowingtons5.unittestexample.calculator

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun `WHEN multiply 2 by 2 EXPECT 4`() {
        val calculator = Calculator()

        val actual = calculator.multiply(2f, 2f)

        val expected = 4f
        assertEquals(expected, actual)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `WHEN divide by zero EXPECT illegal argument exception`() {
        val calculator = Calculator()

        calculator.divide(4f, 0f)
    }
}
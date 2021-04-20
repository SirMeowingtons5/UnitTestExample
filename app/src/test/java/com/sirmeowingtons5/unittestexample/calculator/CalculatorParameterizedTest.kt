package com.sirmeowingtons5.unittestexample.calculator

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CalculatorParameterizedTest(
    private val dividend: Float,
    private val divisor: Float,
    private val expected: Float
) {

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun data() = listOf(
            arrayOf(3f, 1.5f, 2f),
            arrayOf(0f, 1f, 0f),
            arrayOf(1000f, -1f, -1000f)
        )
    }

    @Test
    fun `WHEN divide EXPECT correct result`() {
        val calculator = Calculator()

        val actual = calculator.divide(dividend, divisor)

        assertEquals(expected, actual)
    }
}
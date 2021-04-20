package com.sirmeowingtons5.unittestexample.calculator

class Calculator {

    fun multiply(multiplicand: Float, multiplier: Float): Float =
        multiplicand * multiplier

    fun divide(dividend: Float, divisor: Float): Float =
        if (divisor != 0f) {
            dividend / divisor
        } else {
            throw IllegalArgumentException("Divisor can't be null")
        }
}
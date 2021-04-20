package com.sirmeowingtons5.unittestexample.bag

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Из-за неконтролируемой среды, которую создаёт Random, тесты работают нестабильно.
 * Попробуйте запустить несколько раз, результат выполнения тестов будет меняться.
 */
class MagicBagTest {

    @Test
    fun `WHEN get gold coins EXPECT get 0 coins`() {
        val bag = MagicBag()

        val actual = bag.getGoldCoins()

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get gold coins EXPECT get 25 coins`() {
        val bag = MagicBag()

        val actual = bag.getGoldCoins()

        val expected = 25
        assertEquals(expected, actual)
    }
}
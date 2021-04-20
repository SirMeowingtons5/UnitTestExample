package com.sirmeowingtons5.unittestexample.bag

import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever

/**
 * Заменили стабы на моки
 */
class MagicBagTest {

    @Test
    fun `WHEN get gold coins EXPECT get 0 coins`() {
        val testRandomizer: Randomizer = mock()
        whenever(testRandomizer.nextInt(any(), any())).thenReturn(0)
        val bag = MagicBag(testRandomizer)

        val actual = bag.getGoldCoins()

        val expected = 0
        assertEquals(expected, actual)
    }

    /**
     * В этом тесте явно указываем, при каких входящих значениях nextInt вернется ответ
     */
    @Test
    fun `WHEN get gold coins EXPECT get 25 coins`() {
        val testRandomizer: Randomizer = mock()
        whenever(testRandomizer.nextInt(0, 6)).thenReturn(5)
        val bag = MagicBag(testRandomizer)

        val actual = bag.getGoldCoins()

        val expected = 25
        assertEquals(expected, actual)
    }
}
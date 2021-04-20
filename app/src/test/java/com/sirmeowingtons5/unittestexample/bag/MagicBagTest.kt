package com.sirmeowingtons5.unittestexample.bag

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Тестовая имплементация интерфейса Randomizer
 * Всегда возвращает значение, переданное в конструкторе
 */
class TestRandomizer(private val returnValue: Int) : Randomizer {

    override fun nextInt(from: Int, to: Int): Int = returnValue
}

class MagicBagTest {

    @Test
    fun `WHEN get gold coins EXPECT get 0 coins`() {
        val testRandomizer = TestRandomizer(0)
        val bag = MagicBag(testRandomizer)

        val actual = bag.getGoldCoins()

        val expected = 0
        assertEquals(expected, actual)
    }

    /**
     * Вариант с созданием анонимного объекта
     */
    @Test
    fun `WHEN get gold coins EXPECT get 25 coins`() {
        val testRandomizer = object : Randomizer {
            override fun nextInt(from: Int, to: Int): Int = 5
        }
        val bag = MagicBag(testRandomizer)

        val actual = bag.getGoldCoins()

        val expected = 25
        assertEquals(expected, actual)
    }
}
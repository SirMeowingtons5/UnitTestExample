package com.sirmeowingtons5.unittestexample.bag


/**
 * Вынесли random как зависимость, передаваемую извне
 * Для production кода будет передаваться зависимость с нормальным рандомом
 * Для тестов будет использоваться класс, где мы можем контролировать выдаваемый результат
 */
interface Randomizer {

    fun nextInt(from: Int, to: Int): Int
}

class MagicBag(private val random: Randomizer) {

    private companion object {

        const val MIN_GOLD_PIECES = 0
        const val MAX_GOLD_PIECES = 5
        const val COINS_IN_PIECE = 5
    }

    fun getGoldCoins(): Int {
        val pieces = random.nextInt(MIN_GOLD_PIECES, MAX_GOLD_PIECES + 1)
        return pieces * COINS_IN_PIECE
    }
}
package com.sirmeowingtons5.unittestexample.bag

import kotlin.random.Random

class MagicBag {

    private companion object {

        const val MIN_GOLD_PIECES = 0
        const val MAX_GOLD_PIECES = 5
        const val COINS_IN_PIECE = 5
    }

    fun getGoldCoins(): Int {
        val pieces = Random.nextInt(MIN_GOLD_PIECES, MAX_GOLD_PIECES + 1)
        return pieces * COINS_IN_PIECE
    }
}
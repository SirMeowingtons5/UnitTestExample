package com.sirmeowingtons5.unittestexample.keeper

interface Storage {

    fun saveGold(amount: Int)
}

class GoldKeeper(private val storage: Storage) {

    private companion object {
        const val MAX_COINS = 100
    }

    private var currentAmount = 0

    fun addCoins(amount: Int) {
        currentAmount += amount

        if (currentAmount >= MAX_COINS) {
            storage.saveGold(currentAmount)
            currentAmount = 0
        }
    }
}
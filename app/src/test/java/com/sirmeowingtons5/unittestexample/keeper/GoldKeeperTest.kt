package com.sirmeowingtons5.unittestexample.keeper

import org.junit.Test
import org.mockito.kotlin.any
import org.mockito.kotlin.mock
import org.mockito.kotlin.never
import org.mockito.kotlin.verify

class GoldKeeperTest {

    @Test
    fun `WHEN add 100 coins EXPECT save to storage`() {
        val storage: Storage = mock()
        val keeper = GoldKeeper(storage)

        keeper.addCoins(100)

        verify(storage).saveGold(100)
    }

    @Test
    fun `WHEN add 50 coins EXPECT do not save anything to storage`() {
        val storage: Storage = mock()
        val keeper = GoldKeeper(storage)

        keeper.addCoins(50)

        verify(storage, never()).saveGold(any())
    }
}
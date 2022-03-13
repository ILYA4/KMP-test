package ru.chit.recyclemap.android.fragments.vm

import kotlinx.coroutines.flow.StateFlow
import ru.chit.recyclemap.models.BitcoinPrice

interface BitcoinCurrencyViewModel {

    val bitcoinCurrencyState: StateFlow<BitcoinPrice>

    fun requestBitcoinPrice()
}
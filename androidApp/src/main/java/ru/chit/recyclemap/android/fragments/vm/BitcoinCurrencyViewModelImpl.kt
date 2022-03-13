package ru.chit.recyclemap.android.fragments.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import ru.chit.recyclemap.BitcoinInteractor
import ru.chit.recyclemap.models.BitcoinPrice
import ru.chit.recyclemap.models.Currency

class BitcoinCurrencyViewModelImpl: BitcoinCurrencyViewModel, ViewModel() {

    private val interactor = BitcoinInteractor()

    override val bitcoinCurrencyState = MutableStateFlow(BitcoinPrice(0.0, Currency.USD))

    override fun requestBitcoinPrice() {
        viewModelScope.launch {
            val bitcoinPrice = interactor.getBitcoinPrice(Currency.USD)
            bitcoinCurrencyState.value = bitcoinPrice
        }
    }
}
package ru.chit.recyclemap

import ru.chit.recyclemap.models.BitcoinPrice
import ru.chit.recyclemap.models.Currency
import ru.chit.recyclemap.models.mapper.BitcoinMapper
import ru.chit.recyclermap.repository.BitcoinRepository

class BitcoinInteractor {

    private val repository = BitcoinRepository()
    private val mapper = BitcoinMapper()

    suspend fun getBitcoinPrice(currency: Currency): BitcoinPrice {
        return mapper.mapToBitcoinPrice(
            repository.getBitcoinPrice(currency = currency.name)
        )
    }
}
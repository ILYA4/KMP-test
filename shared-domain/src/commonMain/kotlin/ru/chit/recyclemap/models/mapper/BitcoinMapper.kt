package ru.chit.recyclemap.models.mapper

import ru.chit.recyclemap.models.BitcoinPrice
import ru.chit.recyclemap.models.Currency
import ru.chit.recyclermap.entity.BitcoinPriceDto

class BitcoinMapper {

    fun mapToBitcoinPrice(value: BitcoinPriceDto): BitcoinPrice  {
        return BitcoinPrice(
            amountPrice = value.amount,
            currency = if (value.currency == "USD") Currency.USD else Currency.UNKNOWN
        )
    }
}
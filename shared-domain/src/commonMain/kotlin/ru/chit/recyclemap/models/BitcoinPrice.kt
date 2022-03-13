package ru.chit.recyclemap.models

class BitcoinPrice(
    val amountPrice: Double,
    val currency: Currency
)

enum class Currency {
    USD, UNKNOWN
}
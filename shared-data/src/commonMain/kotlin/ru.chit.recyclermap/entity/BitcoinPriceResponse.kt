package ru.chit.recyclermap.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BitcoinPriceResponse(
    @SerialName("data")
    val data: BitcoinPriceDto
)

@Serializable
data class BitcoinPriceDto(
    @SerialName("amount")
    val amount : Double,
    @SerialName("currency")
    val currency: String
)

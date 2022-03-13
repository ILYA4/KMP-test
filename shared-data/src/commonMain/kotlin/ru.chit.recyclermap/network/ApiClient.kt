package ru.chit.recyclermap.network

import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import ru.chit.recyclermap.entity.BitcoinPriceResponse

class ApiClient(
    private val httpClient: HttpClient
) {

    suspend fun getBitcoinPrice(currency: String): BitcoinPriceResponse {
        return httpClient.get(
            BASE_URL.plus("/v2/prices/spot")) {
            parameter(CURRENCY_KEY, currency)
        }.body()
    }

    companion object {
        private const val BASE_URL = "https://api.coinbase.com"

        private const val CURRENCY_KEY = "currency"

    }
}
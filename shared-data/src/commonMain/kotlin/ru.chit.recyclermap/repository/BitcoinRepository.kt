package ru.chit.recyclermap.repository

import ru.chit.recyclermap.core.httpClient
import ru.chit.recyclermap.entity.BitcoinPriceDto
import ru.chit.recyclermap.network.ApiClient

class BitcoinRepository {

    private val apiClient = ApiClient(httpClient = httpClient)

    suspend fun getBitcoinPrice(currency: String): BitcoinPriceDto  {
        return apiClient.getBitcoinPrice(currency).data
    }
}
package ru.chit.recyclermap.core

import io.github.aakira.napier.Napier
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.logging.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.*
import kotlinx.serialization.json.Json
import java.util.concurrent.TimeUnit

actual val httpClient = androidHttpClient(withLogging = true)

internal fun androidHttpClient(withLogging: Boolean) = HttpClient(OkHttp) {
    engine {
        config {
            retryOnConnectionFailure(true)
            connectTimeout(5, TimeUnit.SECONDS)
        }
    }
    install(ContentNegotiation) {
        val json = Json {
            ignoreUnknownKeys = true
            prettyPrint = true
            isLenient = true
        }
        serialization(
            contentType = ContentType.Application.Json,
            format = json
        )
    }
    if (withLogging) {
        install(Logging) {
            level = LogLevel.HEADERS
            logger = object : Logger {
                override fun log(message: String) {
                    Napier.v(tag = "AndroidHttpClient", message = message)
                }
            }
        }
    }
}
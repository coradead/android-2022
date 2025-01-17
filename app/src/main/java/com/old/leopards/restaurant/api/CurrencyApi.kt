package com.old.leopards.restaurant.api

import com.old.leopards.restaurant.api.models.CurrencyResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyApi {
    @GET("convert")
    @Headers("Content-Type: application/json")
    suspend fun getUSDCurrency(@Query("q") currency: String): CurrencyResponse
}

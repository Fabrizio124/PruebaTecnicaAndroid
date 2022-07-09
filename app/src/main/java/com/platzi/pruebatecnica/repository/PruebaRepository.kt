package com.platzi.pruebatecnica.repository

import com.platzi.pruebatecnica.data.remote.PruebaPeticion
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PruebaRepository {

    @GET("getRegistrationFields")
    fun getPruebaInfo(): Call<PruebaPeticion>
}
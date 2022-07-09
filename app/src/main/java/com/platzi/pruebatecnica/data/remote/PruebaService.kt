package com.platzi.pruebatecnica.data.remote

import com.platzi.pruebatecnica.repository.PruebaRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PruebaService {

    //Retrofit
    companion object {
        fun getPruebaService(): Retrofit {
            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://platon.cf-it.at/affiliate/getRegistrationFields/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit
        }

        //Corrutina
        private fun corrutinePrueba(query: String) {
            CoroutineScope(Dispatchers.IO).launch {
                val call = getPruebaService().create(PruebaRepository::class.java).getPruebaInfo()
            }
        }
    }

}
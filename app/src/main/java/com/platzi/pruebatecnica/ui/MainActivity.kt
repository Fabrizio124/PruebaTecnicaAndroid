package com.platzi.pruebatecnica.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.platzi.pruebatecnica.data.remote.PruebaPeticion
import com.platzi.pruebatecnica.data.remote.PruebaService
import com.platzi.pruebatecnica.databinding.ActivityMainBinding
import com.platzi.pruebatecnica.repository.PruebaRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        callServiceGetUsers()

    }


    private fun callServiceGetUsers() {
        val userService: PruebaRepository =
            PruebaService.getPruebaService().create(PruebaRepository::class.java)
        val result: Call<PruebaPeticion> = userService.getPruebaInfo()

        result.enqueue(object : Callback<PruebaPeticion> {
            override fun onFailure(call: Call<PruebaPeticion>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<PruebaPeticion>,
                response: Response<PruebaPeticion>
            ) {
                Toast.makeText(this@MainActivity, "OK", Toast.LENGTH_LONG).show()
            }
        })

    }
}
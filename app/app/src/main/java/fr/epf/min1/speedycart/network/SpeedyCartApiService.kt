package fr.epf.min1.speedycart.network

import retrofit2.http.GET

interface SpeedyCartApiService {
    @GET("/clients")
    suspend fun getClients() : String
}

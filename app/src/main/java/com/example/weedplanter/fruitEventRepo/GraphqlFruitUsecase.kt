package com.example.weedplanter.fruitEventRepo

import com.apollographql.apollo3.ApolloClient
import com.example.weedplanter.GetFruitEventsQuery
import com.example.weedplanter.UploadFruitEventMutation
import kotlinx.coroutines.CoroutineExceptionHandler
// import com.example.weedplanter.fruitEventRepo.FruitEvent
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GraphqlFruitUsecase {

    suspend fun getFruitEvents(): MutableList<FruitEvent> {
        var responseFruitEvents = mutableListOf<FruitEvent>()
        return withContext(Dispatchers.IO) {
            val apolloClient = ApolloClient.Builder()
                .serverUrl("http://10.0.2.2:4000/")
                .build()
            // Execute your query. This will suspend until the response is received.
            val response = apolloClient.query(GetFruitEventsQuery()).execute()
            //print(response.data?.getFruitEvents?)
            for (i in 1..response.data?.getFruitEvents?.toMutableList()!!.size) {
                val id = response.data?.getFruitEvents?.get(i - 1)?.id!!
                val userName = response.data?.getFruitEvents?.get(i - 1)?.username!!
                val fruit = response.data?.getFruitEvents?.get(i - 1)?.fruit!!
                var tmp = FruitEvent(id, userName, fruit)
                responseFruitEvents.add(tmp)
            }
            return@withContext responseFruitEvents
        }
    }

    suspend fun uploadFruitEvent(userName: String, fruit: String): String {
        return withContext(Dispatchers.IO) {
            val apolloClient = ApolloClient.Builder()
                .serverUrl("http://10.0.2.2:4000/")
                .build()
            // Execute your query. This will suspend until the response is received.
            val response = apolloClient.mutation(UploadFruitEventMutation(userName = userName, fruit = fruit)).execute()
            //print(response.data?.getFruitEvents?)

            return@withContext response.data?.uploadFruitEvent.toString()
        }
    }
}

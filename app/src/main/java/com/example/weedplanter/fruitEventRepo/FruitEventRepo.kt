package com.example.weedplanter.fruitEventRepo

// import com.example.weedplanter.fruitEventRepo.FruitEvent
// import com.example.weedplanter.fruitEventRepo.GraphqlFruitUsecase

class FruitEventRepo {
    // Variable Section
    private val graphqlFruitUsecase = GraphqlFruitUsecase()
    suspend fun getFruitEvents(): MutableList<FruitEvent> = graphqlFruitUsecase.getFruitEvents()
    suspend fun uploadFruitEvent(userName: String, fruit: String): String = graphqlFruitUsecase.uploadFruitEvent(userName, fruit)
}
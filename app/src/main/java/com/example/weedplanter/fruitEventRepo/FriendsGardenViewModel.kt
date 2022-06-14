package com.example.weedplanter.fruitEventRepo
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
// import com.example.weedplanter.fruitEventRepo.FruitEvent
// import com.example.weedplanter.fruitEventRepo.FruitEventRepo
import kotlinx.coroutines.launch


class FriendsGardenViewModel : ViewModel() {
    private val fruitEventRepo = FruitEventRepo()
    private var fruitEventList = mutableListOf<FruitEvent>()

    fun getFruitEvents(): MutableList<FruitEvent> {
        viewModelScope.launch {
            fruitEventList = fruitEventRepo.getFruitEvents()
        }
        return fruitEventList
    }

    fun uploadFruitEvent(userName: String, fruit: String) {
        viewModelScope.launch {
            val result = fruitEventRepo.uploadFruitEvent(userName, fruit)
            Log.d("upload", result)
        }
    }
}
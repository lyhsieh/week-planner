package com.example.weedplanter

import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyGardenViewModel : ViewModel() {


    private val _apples = MutableLiveData<Int>(2)
    val apples: LiveData<Int> = _apples

    private val _bananas = MutableLiveData<Int>(3)
    val bananas: LiveData<Int> = _bananas

    private val _grapes = MutableLiveData<Int>(1)
    val grapes: LiveData<Int> = _grapes

    private val _lemons = MutableLiveData<Int>(1)
    val lemons: LiveData<Int> = _lemons

    private val _watermelons = MutableLiveData<Int>(2)
    val watermelons: LiveData<Int> = _watermelons





    init {
        Log.d("GameFragment", "GameViewModel created!")
//        apples = 0
//        bananas = 0
//        lemons = 0
//        grapes = 0
//        watermelons = 0
        reset()
    }

//    fun getApples() : Int {
//        return _apples.value;
//    }
//
//    fun getBananas() : Int {
//        return _bananas.value;
//    }
//
//    fun getLemons() : Int {
//        return _lemons.value;
//    }
//
//    fun getGrapes() : Int {
//        return _grapes.value;
//    }
//
//    fun getWatermelons() : Int {
//        return _watermelons.value
//    }

    fun rewardApple(){
        var apples = _apples.value!! + 1

        _apples.value = apples
    }

    fun rewardBanana(){
        var bananas = _bananas.value!! + 1
        _bananas.value = bananas
    }

    fun rewardGrape(){
        var grapes = _grapes.value!! + 1
        _grapes.value = grapes
    }

    fun rewardLemon(){
        var lemons = _lemons.value!! +1
        _lemons.value = lemons
    }

    fun rewardWatermelon(){
        var watermelons = _watermelons.value!! +1
        _watermelons.value = watermelons
    }

    fun reset(){
        _apples.value = 2
        _bananas.value = 2
        _grapes.value = 1
        _lemons.value = 2
        _watermelons.value = 2
    }

}
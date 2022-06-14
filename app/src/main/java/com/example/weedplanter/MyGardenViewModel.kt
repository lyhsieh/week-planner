package com.example.weedplanter

import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyGardenViewModel : ViewModel() {


    private val _apples = MutableLiveData<Int>()
    val apples: LiveData<Int> = _apples

    private val _bananas = MutableLiveData<Int>()
    val bananas: LiveData<Int> = _bananas

    private val _grapes = MutableLiveData<Int>()
    val grapes: LiveData<Int> = _grapes

    private val _lemons = MutableLiveData<Int>()
    val lemons: LiveData<Int> = _lemons

    private val _watermelons = MutableLiveData<Int>()
    val watermelons: LiveData<Int> = _watermelons

    var apple = 2
    var banana = 2
    var lemon = 2
    var grape  = 1
    var watermelon =2





    init {
        Log.d("GardenViewModel", "GardenViewModel created!")
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
        Log.d("GardenViewModel", "rewardApple")
        Log.d("GardenViewModel",  _apples.value.toString())
        var apples = _apples.value!! + 1
//
//        _apples.value = apples
        _apples.setValue(apples)
        apple += 1

        Log.d("GardenViewModel",  _apples.value.toString())

    }

    fun rewardBanana(){
        Log.d("GardenViewModel", "rewardBanana")
        Log.d("GardenViewModel",  _bananas.value.toString())
        var bananas = _bananas.value!! + 1
//        _bananas.value = bananas
        _bananas.setValue(bananas)
        banana += 1
        Log.d("GardenViewModel",  _bananas.value.toString())
    }

    fun rewardGrape(){
        Log.d("GardenViewModel", "rewardGrape")
        Log.d("GardenViewModel",  _grapes.value.toString())
        var grapes = _grapes.value!! + 1
//        _grapes.value = grapes
        _grapes.setValue(grapes)
        grape += 1
        Log.d("GardenViewModel",  _grapes.value.toString())
    }

    fun rewardLemon(){
        Log.d("GardenViewModel", "rewardLemon")
        Log.d("GardenViewModel",  _lemons.value.toString())
        var lemons = _lemons.value!! +1
//        _lemons.value = lemons
        _lemons.setValue(lemons)
        lemon  += 1
        Log.d("GardenViewModel",  _lemons.value.toString())
    }

    fun rewardWatermelon(){
        Log.d("GardenViewModel", "rewardWatermelon")
        Log.d("GardenViewModel",  _watermelons.value.toString())
        var watermelons = _watermelons.value!! +1
//        _watermelons.value = watermelons
        _watermelons.setValue(watermelons)
        watermelon += 1
        Log.d("GardenViewModel",  _watermelons.value.toString())
    }

    fun reset(){
        _apples.value = 2
        _bananas.value = 2
        _grapes.value = 1
        _lemons.value = 2
        _watermelons.value = 2
        apple = 1
        banana = 1
        lemon = 1
        grape  = 1
        watermelon =1
    }

}
package com.example.weedplanter

import android.app.Application
import android.util.Log

class GlobalVariable: Application() {
    companion object{
        var apple = 1
        var banana = 1
        var lemon = 1
        var grape  = 1
        var watermelon =1


        fun rewardApple(){
            Log.d("GardenViewModel", "rewardApple")
            Log.d("GardenViewModel",  apple.toString())
            apple += 1
            Log.d("GardenViewModel",  apple.toString())

        }

        fun rewardBanana(){
            Log.d("GardenViewModel", "rewardBanana")
            Log.d("GardenViewModel",  banana.toString())
            banana += 1
            Log.d("GardenViewModel",  banana.toString())
        }

        fun rewardGrape(){
            Log.d("GardenViewModel", "rewardGrape")
            Log.d("GardenViewModel",  grape.toString())


            grape += 1
            Log.d("GardenViewModel",  grape.toString())
        }

        fun rewardLemon(){
            Log.d("GardenViewModel", "rewardLemon")
            Log.d("GardenViewModel",  lemon.toString())
            lemon  += 1
            Log.d("GardenViewModel",  lemon.toString())
        }

        fun rewardWatermelon(){
            Log.d("GardenViewModel", "rewardWatermelon")
            Log.d("GardenViewModel",  watermelon.toString())
            watermelon += 1
            Log.d("GardenViewModel",  watermelon.toString())
        }

        fun reset(){
            apple = 1
            banana = 1
            lemon = 1
            grape  = 1
            watermelon =1
        }

    }
}
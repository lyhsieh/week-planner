package com.example.weedplanter

import android.app.Application
import com.example.weedplanter.data.ToDoDatabase

class BaseApplication : Application() {

    val database: ToDoDatabase by lazy { ToDoDatabase.getDatabase(this) }
}
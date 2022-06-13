package com.example.weedplanter.data

import androidx.lifecycle.LiveData


class ToDoRepository(private val toDoDao: ToDoDao) {

    val getAllData : LiveData<List<ToDoData>> = toDoDao.getAllData()

    suspend fun insertData(toDoData: ToDoData)
    {
        toDoDao.insertData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData)
    {
        toDoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData)
    {
        toDoDao.deleteItem(toDoData)
    }

    suspend fun deleteAll()
    {
        toDoDao.deleteAll()
    }
    fun searchByIdDatabase(searchQuery: Int): LiveData<ToDoData>
    {
        return toDoDao.searchByIdDatabase(searchQuery)
    }
    fun searchDatabase(searchQuery : String): LiveData<List<ToDoData>>
    {
        return toDoDao.searchDatabase(searchQuery)
    }
}
package com.example.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todos")
data class Todo(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val task: String,
    val isCompleted: Boolean = false,
    val timestamp: Long = System.currentTimeMillis()
)

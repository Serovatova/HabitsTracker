package com.example.habitstracker.domain.repository

interface HabitRepository {
    fun addHabit()
    fun editHabit()
    fun deleteHabit()
    fun getAllHabit()
    fun getAllCompletedHabit()
    fun getAllNotCompletedHabit()
}
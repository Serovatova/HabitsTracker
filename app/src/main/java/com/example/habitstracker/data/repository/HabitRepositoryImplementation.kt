package com.example.habitstracker.data.repository

import com.example.habitstracker.domain.repository.HabitRepository

interface HabitRepositoryImplementation : HabitRepository {
    override fun addHabit()
    override fun editHabit()
    override fun deleteHabit()
    override fun getAllHabit()
    override fun getAllCompletedHabit()
    override fun getAllNotCompletedHabit()
}
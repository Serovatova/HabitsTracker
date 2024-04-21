package com.example.habitstracker.domain.usecase

import com.example.habitstracker.domain.repository.HabitRepository

class GetAllNotCompletedHabitUseCase(private val repository: HabitRepository) {
   operator fun invoke(){
        repository.getAllNotCompletedHabit()
    }
}
package com.example.habitstracker.domain.usecase

import com.example.habitstracker.domain.repository.HabitRepository

class DeleteHabitUseCase(private val repository: HabitRepository) {
    operator fun invoke(){
        repository.deleteHabit()
    }
}
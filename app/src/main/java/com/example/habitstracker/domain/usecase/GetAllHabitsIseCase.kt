package com.example.habitstracker.domain.usecase

import com.example.habitstracker.domain.repository.HabitRepository

class GetAllHabitsIseCase(private val repository: HabitRepository) {
    operator fun invoke() {
        return repository.getAllHabit()
    }
}
package com.example.habitstracker.domain.usecase

import com.example.habitstracker.domain.repository.HabitRepository


class EditHabitUseCase(private val repository: HabitRepository) {
    operator fun invoke(){
        repository.editHabit()
    }
}
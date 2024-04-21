package com.example.habitstracker.domain.models

sealed class StatusHabit {
    data object InProgress : StatusHabit()
    data object NotStarted : StatusHabit()
    data object Completed : StatusHabit()
}
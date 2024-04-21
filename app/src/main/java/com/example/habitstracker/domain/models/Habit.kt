package com.example.habitstracker.domain.models

class Habit(
    val name: String ="",
    val description: String = "",
    val daysToFollowTheHabit: OnWhatDaysToFollowTheHabit = OnWhatDaysToFollowTheHabit.EveryDay,
    val status: StatusHabit = StatusHabit.NotStarted,
)
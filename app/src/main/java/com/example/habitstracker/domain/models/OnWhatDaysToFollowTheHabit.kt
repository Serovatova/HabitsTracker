package com.example.habitstracker.domain.models

sealed class OnWhatDaysToFollowTheHabit{
    data object Weekends : OnWhatDaysToFollowTheHabit()
    data object Weekday : OnWhatDaysToFollowTheHabit()
    data object EveryDay : OnWhatDaysToFollowTheHabit()
    data object SelectDay: OnWhatDaysToFollowTheHabit()

}

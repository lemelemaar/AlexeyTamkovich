package com.example.alexeytamkovich

import kotlin.math.abs

class FootballMatch(private var goalFirst: Int = 0, private var goalSecond: Int = 0) {
    override fun toString(): String {
        return "$goalFirst : $goalSecond"
    }

    fun setGoals(goalFirst: Int, goalSecond: Int): FootballMatch {
        this.goalFirst = goalFirst
        this.goalSecond = goalSecond
        return this
    }

    fun draw(): Boolean {
        return this.goalFirst == this.goalSecond
    }

    fun maxDiff(): Int {
        return abs(this.goalFirst - this.goalSecond)
    }
}
package com.example.alexeytamkovich

fun main() {
    val arrayMatches: Array<FootballMatch> = Array(size = 10) {
        FootballMatch().setGoals((0..5).random(), (0..5).random())
    }
    val listMatches: ArrayList<FootballMatch> = arrayMatches.toCollection(ArrayList())
    println(listMatches)

    var diff = 0
    for (i in arrayMatches) {
        if (i.draw()) listMatches.remove(i)
        if (i.maxDiff() > diff) diff = i.maxDiff()
    }

    val setGoals: Set<Int> = setOf(diff)

    println(listMatches)
    println(setGoals)
}
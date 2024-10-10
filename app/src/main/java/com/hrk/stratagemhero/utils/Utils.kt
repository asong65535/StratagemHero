package com.hrk.stratagemhero.utils

fun calculateScore(numArrows: Int, timeLeft: Int, roundBonus: Int, perfectBonus: Boolean): Int {
    var score = 0
    if (perfectBonus) {
        score += 100
    }
    score += numArrows * 10
    score += timeLeft
    score += roundBonus * 100
    return score
}
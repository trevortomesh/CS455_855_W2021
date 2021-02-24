package com.bignerdranch.android.geoquiz2

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {


    var currentIndex = 0

    private val questionsBank = listOf(
            Question(R.string.question_capital, answer = false),
            Question(R.string.question_fredericton, answer = true),
            Question(R.string.question_niagra, answer = true),
            Question(R.string.question_oceans,answer = true),
            Question(R.string.question_ontario, answer = true),
            Question(R.string.question_provinces, answer = false)
    )

    val currentQuestionAnswer: Boolean
        get() = questionsBank[currentIndex].answer

    val currentQuestionText: Int
        get() = questionsBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionsBank.size
    }
}
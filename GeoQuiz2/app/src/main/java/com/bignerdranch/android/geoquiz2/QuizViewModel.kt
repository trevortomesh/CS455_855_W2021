package com.bignerdranch.android.geoquiz2

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {

    init{
        Log.d(TAG, "ViewModel instance created")
    }

    override fun onCleared(){
        super.onCleared()
        Log.d(TAG, "ViewModel instance is about to be destroyed!!!")
    }
    
}
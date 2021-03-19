package com.bignerdranch.android.criminalintent2

import android.os.Bundle
import androidx.fragment.app.Fragment

class CrimeFragment : Fragment() {

    private lateinit var crime : Crime

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        crime = Crime()
        }
    }

package com.coderbee.veganloversclub

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val idMeal = MutableLiveData<String>()
    val strMeal = MutableLiveData<String>()
    val strDescription = MutableLiveData<String>()
}
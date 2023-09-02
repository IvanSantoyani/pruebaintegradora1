package com.curso.android.app.practica.pruebaintegradora1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _result = MutableLiveData<String>()
    val result: LiveData<String> get() = _result

    fun compareTexts(text1: String, text2: String) {
        _result.value = if (text1 == text2) "Las cadenas son iguales" else "Las cadenas son diferentes"
    }
}
package com.curso.android.app.practica.pruebaintegradora1

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {
    @get:Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun compareTexts_sameTexts_resultIsEqual() {
        val viewModel = MainViewModel()
        viewModel.compareTexts("texto", "texto")
        assertEquals("Las cadenas son iguales", viewModel.result.value)
    }

    @Test
    fun compareTexts_differentTexts_resultIsDifferent() {
        val viewModel = MainViewModel()
        viewModel.compareTexts("texto1", "texto2")
        assertEquals("Las cadenas son diferentes", viewModel.result.value)
    }
}
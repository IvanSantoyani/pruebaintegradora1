package com.curso.android.app.practica.pruebaintegradora1

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun compareTexts_sameTexts_resultIsEqual() {
        onView(withId(R.id.editText1)).perform(typeText("texto"))
        onView(withId(R.id.editText2)).perform(typeText("texto"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son iguales")))
    }

    @Test
    fun compareTexts_differentTexts_resultIsDifferent() {
        onView(withId(R.id.editText1)).perform(typeText("texto1"))
        onView(withId(R.id.editText2)).perform(typeText("texto2"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son diferentes")))
    }
}
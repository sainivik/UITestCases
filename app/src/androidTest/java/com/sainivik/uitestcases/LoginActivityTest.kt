package com.sainivik.uitestcases

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(
    AndroidJUnit4::class
)
public class LoginActivityTest {

    @Rule
    @JvmField
    var activityRule: ActivityTestRule<LoginActivity> =
        ActivityTestRule<LoginActivity>(LoginActivity::class.java)

    @Test
    public fun checkLoginSuccess() {

        onView(withId(activityRule.activity.binding.edtEmail.id)).perform(
            typeText("abcd@gmail.com"),
            closeSoftKeyboard()
        )
        onView(withId(activityRule.activity.binding.edtPass.id)).perform(
            typeText("abcd123"),
            closeSoftKeyboard()
        )
        onView(withId(activityRule.activity.binding.btnLogin.id)).perform(click())
        onView(withId(activityRule.activity.binding.tvResult.id)).check(matches(withText("LOGIN SUCCESS!")))

    }


}
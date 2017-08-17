package com.example.user.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by user on 8/15/17.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void ensureTextChangesWork() {

       // Spoon.screenshot(mActivityRule.getActivity(),"initial_state");
        // Type text and then press the button.
        onView(withId(R.id.inputField)).perform(typeText("Hello from the Earth"), closeSoftKeyboard());
        onView(withId(R.id.button3)).perform(click());
            Spoon.screenshot(mActivityRule.getActivity(),"after_state");
//
        // Check that the text was changed.
        onView(withId(R.id.inputField)).check(matches(withText("Hello from the Moon")));

    }
}
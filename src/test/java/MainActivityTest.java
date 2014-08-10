package com.example.helloapp.gradletest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.RobolectricTestRunner;
import com.example.helloapp.MainActivity;

import static org.junit.Assert.assertTrue;

@Config (emulateSdk = 18) //Robolectric support API level 18,17, 16, but not 19
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {
      @Test
      public void testCreate() throws Exception {
        MainActivity activity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertTrue(activity != null);
      }
}

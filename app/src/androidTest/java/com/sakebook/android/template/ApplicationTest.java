package com.sakebook.android.template;

import static junit.framework.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.app.Application;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class ApplicationTest{

    private Application application;

    @Before
    public void setup() {
        application = new Application();
        Robolectric.application = application;
    }

    @After
    public void teardown() {
    }

    @Test
    public void testMethod() {
        assertTrue(true);
    }
}
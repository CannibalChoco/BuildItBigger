package com.udacity.gradle;

import android.app.Application;
import android.support.test.runner.AndroidJUnit4;
import android.test.ApplicationTestCase;

import com.example.jokes.Joke;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;


/**
 * Test implemented after reading the following discussion:
 * https://discussions.udacity.com/t/writing-tests-for-async-task/25482/8
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest extends ApplicationTestCase<Application>{

    String joke = null;

    public AsyncTaskTest() {
        super(Application.class);
    }

    @Test
    public void testAsyncTask(){
        try{
            EndpointsAsyncTask task = new EndpointsAsyncTask();
            task.execute();
            joke = task.get(10, TimeUnit.SECONDS);
        } catch (Exception e){
            fail("Timed out");
        }

        assertEquals(Joke.getJoke(), joke);
    }
}

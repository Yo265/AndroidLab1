package com.example.helloworld;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MinMaxUnitTest {
    @Test
    public void addition_isCorrect_Min() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            Test.add(i);
        }
        Integer j = 0;
        assertEquals(m.min(Test), j);
    }
    @Test
    public void addition_isCorrect_Min1() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 34; i < 100; ++i){
            Test.add(i);
        }
        Integer j = 34;
        assertEquals(m.min(Test), j);
    }
    @Test
    public void addition_isIncorrect_Min2() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            Test.add(i);
        }
        Integer j = 1;
        assertNotEquals(m.min(Test), j);
    }
    @Test
    public void addition_isIncorrect_Min3() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 34; i < 100; ++i){
            Test.add(i);
        }
        Integer j = 1;
        assertNotEquals(m.min(Test), j);
    }
    @Test
    public void addition_isCorrect_Max() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            Test.add(i);
        }
        Integer j = 9;
        assertEquals(m.max(Test), j);
    }
    @Test
    public void addition_isCorrect_Max1() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 34; i < 100; ++i){
            Test.add(i);
        }
        Integer j = 99;
        assertEquals(m.max(Test), j);
    }
    @Test
    public void addition_isIncorrect_Max2() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 0; i < 10; ++i){
            Test.add(i);
        }
        Integer j = 1;
        assertNotEquals(m.max(Test), j);
    }
    @Test
    public void addition_isIncorrect_Max3() {
        MainActivity m = new MainActivity();
        ArrayList<Integer> Test = new ArrayList<>();
        for (int i = 34; i < 100; ++i){
            Test.add(i);
        }
        Integer j = 1;
        assertNotEquals(m.max(Test), j);
    }

}

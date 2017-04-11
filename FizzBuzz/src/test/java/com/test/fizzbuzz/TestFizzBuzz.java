/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.fizzbuzz;

import com.kata.fizzbuzz.FizzBuzz;
import static org.hamcrest.CoreMatchers.equalTo;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

/**
 *
 * @author hlamghari
 */
public class TestFizzBuzz {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void negativeTest(){
        MatcherAssert.assertThat(fizzBuzz.start(-1), is(equalTo(null)));
    }
    @Test
    public void defaultTest(){
        MatcherAssert.assertThat(fizzBuzz.start(8), is(equalTo("8")));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kata.fizzbuzz;

/**
 *
 * @author hlamghari
 */
public class FizzBuzz {
    public String start(int number) {
        if (number > 0) {
            if (number % 15 == 0) {
                return "fizzbuzz";
            }
            if (number % 5 == 0) {
                return "buzz";
            }
            if (number % 3 == 0) {
                return "fizz";
            }
            return String.valueOf(number);
        }
        return null;
    }
}

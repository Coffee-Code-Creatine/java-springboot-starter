package com.coffeecodecreatine.education.demo3.controller;

import com.coffeecodecreatine.education.demo3.util.PrimeNumbers;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Demo3ControllerTest {

    @Test
    void isPrime() {
        HashMap<Integer, Boolean> solutions = new HashMap<Integer, Boolean>();
        solutions.put(1, false);
        solutions.put(2, true);
        solutions.put(3, true);
        solutions.put(4, false);
        solutions.put(5, true);
        solutions.put(6, false);
        solutions.put(7, true);
        solutions.put(8, false);
        solutions.put(9, false);
        solutions.put(10, false);

        for (int i = 1; i < 10; i++) {
            try {
                boolean isPrime = PrimeNumbers.isPrime(i);
                assertEquals(solutions.get(i), isPrime);
            } catch (Exception e) {
                System.out.println("Exception throw");
                assertEquals(true, false);
            }
        }
    }

    @Test
    public void isPrimeToLarge() {
        assertThrows(Exception.class, () -> {
            boolean isPrime = PrimeNumbers.isPrime(11);
        });
    }
}
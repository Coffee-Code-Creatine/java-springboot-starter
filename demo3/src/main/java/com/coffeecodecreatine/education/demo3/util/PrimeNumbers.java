package com.coffeecodecreatine.education.demo3.util;

public class PrimeNumbers {

    public static boolean isPrime(int n) throws Exception {
        int maxValue = 10;
        if (n >= maxValue) {
            throw new Exception("Value too large for prime number method");
        } else {
            // Corner case
            if (n <= 1)
                return false;

            // Check from 2 to n-1
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        }
    }
}

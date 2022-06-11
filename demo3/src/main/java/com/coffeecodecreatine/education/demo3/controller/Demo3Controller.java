package com.coffeecodecreatine.education.demo3.controller;

import com.coffeecodecreatine.education.demo3.util.PrimeNumbers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo3Controller {

    @PostMapping("isPrime")
    CustomJsonResponse isPrime(@RequestBody CustomJsonRequest customJsonRequest) {

        boolean isPrime;
        CustomJsonResponse customJsonResponse = new CustomJsonResponse();
        try {
            isPrime = PrimeNumbers.isPrime(customJsonRequest.getPotentialPrime());
            customJsonResponse.setPrime(isPrime);
        } catch (Exception e) {
            customJsonResponse.setMessage("Unable to compute prime");
        }
        return customJsonResponse;
    }


    public static class CustomJsonRequest {
        int potentialPrime;

        public CustomJsonRequest(int potentialPrime) {
            this.potentialPrime = potentialPrime;
        }

        public CustomJsonRequest() {
        }

        public int getPotentialPrime() {
            return potentialPrime;
        }

        public void setPotentialPrime(int potentialPrime) {
            this.potentialPrime = potentialPrime;
        }
    }

    public static class CustomJsonResponse {
        boolean isPrime;
        String message;

        public CustomJsonResponse(boolean isPrime, String message) {
            this.isPrime = isPrime;
            this.message = message;
        }

        public CustomJsonResponse() {

        }

        public boolean isPrime() {
            return isPrime;
        }

        public void setPrime(boolean prime) {
            isPrime = prime;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }


}

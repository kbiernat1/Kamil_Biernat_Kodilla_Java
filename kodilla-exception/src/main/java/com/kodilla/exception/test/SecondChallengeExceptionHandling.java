package com.kodilla.exception.test;

public class SecondChallengeExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = "no result";

        try {
            result = secondChallenge.probablyIWillThrowException(1.5, 1);
        } catch (Exception e){
            System.out.println("exception: " + e);
        } finally {
            System.out.println(result);
        }
    }
}

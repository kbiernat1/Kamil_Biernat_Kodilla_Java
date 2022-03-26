package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTestSuite {
    @Test
    void probablyIWillThrowException() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        //when & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 1)),
                () -> assertThrows(Throwable.class, () -> secondChallenge.probablyIWillThrowException(10, 1)),
                () -> assertThrows(Throwable.class, () -> secondChallenge.probablyIWillThrowException(2, 1.5))
        );
    }
}

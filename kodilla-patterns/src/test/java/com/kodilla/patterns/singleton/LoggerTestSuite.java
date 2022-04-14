package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLong() {
        //given
        logger = Logger.INSTANCE;
        logger.log("exemplary log");
        //when
        String logName = logger.getLastLog();
        //then
        Assertions.assertEquals("exemplary log", logName);
    }
}
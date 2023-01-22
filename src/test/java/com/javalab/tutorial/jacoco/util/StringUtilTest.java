package com.javalab.tutorial.jacoco.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    public void givenString10_whenCallingStringCalculator_thenItShouldReturn10() {
        assertEquals(StringUtil.StringCalculator("10"), 10);
    }
}
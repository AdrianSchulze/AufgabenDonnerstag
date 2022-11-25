package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntermediateTest {
    @Test
    void givesBackNumberValueWhenUsingNumber() {
        //GIVEN
        int num = 5;
        //WHEN
        String actual = Intermediate.giveBackNumValue(num);
        //THEN
        assertEquals("Fünf", actual);
    }

}
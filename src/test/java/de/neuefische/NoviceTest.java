package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoviceTest {

    @Test
    void ifNumberGreaterThan0() {
        //GIVEN
        int num = 1;
        //WHEN
        boolean actual = Novice.checkNumberGreaterThan0(num);
        //THEN
        assertEquals(true, actual);
    }

    @Test
    void wasPotencyCorrectlyAdded() {
        //GIVEN
        int num = 3;
        //WHEN
        int actual = Novice.addPotency(num);
        //THEN
        assertEquals(9, actual);
    }

}
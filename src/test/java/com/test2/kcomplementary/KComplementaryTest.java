package com.test2.kcomplementary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KComplementaryTest {

    @Test public void testKComplementarySimple() {
        assertEquals(1, new KComplementary().countComplementaries(new int[]{1,2,3}, 4));
        assertEquals(1, new KComplementary().countComplementaries(new int[]{1,2,0,0,3}, 4));
        assertEquals(1, new KComplementary().countComplementaries(new int[]{1,3}, 4));
        assertEquals(0, new KComplementary().countComplementaries(new int[]{1}, 4));

        assertEquals(1, new KComplementary().countComplementaries(new int[]{1,2,3,9,9,9,9}, 4));

        assertEquals(2, new KComplementary().countComplementaries(new int[]{1,2,3,2}, 4));
        assertEquals(4, new KComplementary().countComplementaries(new int[]{1,2,3,2,2}, 4));

        assertEquals(6, new KComplementary().countComplementaries(new int[]{0,0,0,0,1,0,0}, 1));
    }

    @Test public void testKComplementaryZeroK() {
        assertEquals(0, new KComplementary().countComplementaries(new int[]{}, 0));
        assertEquals(0, new KComplementary().countComplementaries(new int[]{1,2,3}, 0));
        assertEquals(15, new KComplementary().countComplementaries(new int[]{0,0,0,0,1,0,0}, 0));
    }

    @Test public void testKComplementaryZerosArray() {
        assertEquals(0, new KComplementary().countComplementaries(new int[]{0,0,0,0,0,0,0}, 1));
    }

    @Test public void testKComplementaryNegative() {
        assertEquals(1, new KComplementary().countComplementaries(new int[]{-1,2,5}, 4));
        assertEquals(0, new KComplementary().countComplementaries(new int[]{-1,2,5}, 5));
    }
}

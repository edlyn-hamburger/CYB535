package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class mathUtilsTest {

    mathUtils m1 = new mathUtils();

    @Test
    void add()
    {
        int add = m1.add(4, 8);
        assertEquals (12, add); 
    }

    @Test
    void sub()
    {
        int sub = m1.sub(10, 4);
        assertEquals(6, sub); 
    }

    @Test
    void mult()
    {
        int mult = m1.mult(2, 4);
        assertEquals(8, mult);
    }

    @SuppressWarnings("deprecation")
    @Test
    void div()
    {
        double div = m1.div(20, 4);
        assertEquals(5, div); 
    }
    
}

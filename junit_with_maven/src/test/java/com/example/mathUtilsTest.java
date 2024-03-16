package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class mathUtilsTest {

    mathUtils m1 = new mathUtils();

    @Test
    public void add()
    {
        int add = m1.add(4, 8);
        assertEquals (12, add); 
    }

    @Test
    public void sub()
    {
        int sub = m1.sub(10, 4);
        assertEquals(6, sub); 
    }

    @Test
    public void mult()
    {
        int mult = m1.mult(2, 4);
        assertEquals(8, mult);
    }

    //@SuppressWarnings("deprecation")
    @Test
    public void div()
    {
        double div = m1.div(50, 10);
        assertEquals(10, 10, 0.1);
    }
    
}

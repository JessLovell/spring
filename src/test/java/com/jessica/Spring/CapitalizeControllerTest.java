package com.jessica.Spring;

import org.junit.Test;

import static org.junit.Assert.*;

public class CapitalizeControllerTest {

    @Test
    public void testUpperCase() {

        //expect all inputs to be returned as capitalized
        assertEquals("JESSICA", CapitalizeController.upperCase("jessica"));
        assertEquals("THIS IS A TEST STRING", CapitalizeController.upperCase("this is a test string"));
        assertEquals("THIS IS ANOTHER TEST", CapitalizeController.upperCase("this is another test"));
        assertEquals("123 THIS IS A TEST", CapitalizeController.upperCase("123 this is a test"));
        assertEquals("THISIS A TEST", CapitalizeController.upperCase("THISIS A Test"));
    }
}
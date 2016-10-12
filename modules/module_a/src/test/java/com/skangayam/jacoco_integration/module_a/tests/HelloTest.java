package com.skangayam.jacoco_integration.module_a.tests;

import com.skangayam.jacoco_integration.module_a.Hello;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloTest {

    @Test
    public void negateInputTest() throws Exception {
        Hello h = new Hello();
        assertTrue("hello is null", h != null);
        assertTrue("negateInput error", h.negateInput(false));
        assertTrue("negateInput error", h.negateInput(true) == false);
    }
}

package com.skangayam.jacoco_integration.module_b.tests;

import com.skangayam.jacoco_integration.module_b.Start;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class StartTest {

    @Test
    public void sayHelloTest() throws Exception {
        Start s = new Start();
        assertTrue(s != null);
        assertTrue(s.sayHello("world").equals("Hello world"));
    }
}

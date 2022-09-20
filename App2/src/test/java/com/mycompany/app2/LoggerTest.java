/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.app2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yazee
 */
public class LoggerTest {
    
    public LoggerTest() {
    }

    @Test
    public void testSomeMethod() {
    Logger log1 = Logger.getLogger();
    Logger log2 = Logger.getLogger();
    assertEquals(log1, log2);
    }
    
}

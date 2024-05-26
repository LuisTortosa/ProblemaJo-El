/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.problema;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class UtilsTest {
    
    
    @org.junit.jupiter.api.Test
    public void testComprobarReptil() {
        System.out.println("ComprobarReptil");
        String tipo = "tortuga";
        boolean expResult = true;
        boolean result = Utils.ComprobarReptil(tipo);
        assertEquals(expResult, result);
        
        System.out.println("ComprobarReptil");
        tipo = "momia";
        expResult = false;
        result = Utils.ComprobarReptil(tipo);
        assertEquals(expResult, result);
    }
    
}

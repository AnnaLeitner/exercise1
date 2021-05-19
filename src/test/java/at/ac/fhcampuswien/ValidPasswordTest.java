package at.ac.fhcampuswien;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class ValidPasswordTest {

    @BeforeAll
    public static void init() {
        System.out.println("Testing Exercise 1");
    }

    @AfterAll
    public static void finish() {
        System.out.println("Finished Testing Exercise 1");
    }

    @Test
    @DisplayName("Password length")
    public void validLengthTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isValid("password"));
    }
    @Test
    @DisplayName("Too short")
    public void tooShort(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.isValid("help"));
    }

    @Test
    @DisplayName("Uppercase")
    public void hasUpperCaseTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.hasUpperCase("Password"));
    }

    @Test
    @DisplayName("Numbers check")
    public void numbersTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isNumeric("1234"));
    }
    @Test
    @DisplayName("Letter check")
    public void lettersTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isAlpha("password"));
    }

    @Test
    @DisplayName("Numbers and Letter check")
    public void alphaNumberTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isAlphaNumeric("password123"));
    }





}

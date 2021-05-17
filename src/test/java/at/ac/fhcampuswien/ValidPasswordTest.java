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
        assertTrue(pw.checkPassword("Password"));
    }
    @Test
    @DisplayName("Too short password")
    public void tooShort(){
        ValidPassword pw = new ValidPassword();
        assertEquals(false, pw.isValid("help"));
    }

    @Test
    @DisplayName("Has password UpperCase")
    public void hasUpperCaseTest(){
        ValidPassword pw = new ValidPassword();
        assertEquals(true, pw.hasUpperCase("Password"));
    }

    @Test
    @DisplayName("Contains password numbers")
    public void numbersTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isNumeric("password1"));
    }


}

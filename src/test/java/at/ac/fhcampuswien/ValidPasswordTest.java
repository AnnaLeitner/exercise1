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
    @DisplayName("Check if string contains numbers and at least one Uppercase")
    public void alphaNumberTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isUpperLowerAlphaNumeric("Password123"));
    }

    @Test
    @DisplayName("Special character check")
    public void specialCharTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.specialChar("password()#$?!%/@"));
    }

    @Test
    @DisplayName("Check Password")
    public void passwordCheck(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.checkPassword("P4ssw0rd#"));
    }

    //Erweiterung
    @Test
    @DisplayName("Number occurs three times check")
    public void occurThreeTimesTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.occurThree("password112211"));
    }

    @Test
    @DisplayName("Ongoing Numbers check")
    public void ongoingNumbersTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.ongoingNumbers("p1s23"));
    }

    @Test
    @DisplayName("Ongoing Numbers check")
    public void checkPassword2Test(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.checkPassword2("P4ssw0rd#12"));
    }


}
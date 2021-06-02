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
    @DisplayName("Valid: Password length")
    public void validLengthTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isValid("password"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Password length")
    public void tooShort(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.isValid("short"),"Not a valid password");
    }

    @Test
    @DisplayName("Valid: Check if string contains numbers and at least one Uppercase")
    public void alphaNumberTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.isUpperLowerAlphaNumeric("Password123"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Check if string contains numbers and at least one Uppercase")
    public void noAlphaNumberTest(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.isUpperLowerAlphaNumeric("1111"), "Not a valid password");
    }

    @Test
    @DisplayName("Valid: Special character check")
    public void specialCharTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.specialChar("password()#$?!%/@"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Special character check")
    public void noSpecialCharTest(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.specialChar(" {•◡•} "), "Not a valid password");
    }

    @Test
    @DisplayName("Valid: Check Password")
    public void passwordCheck(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.checkPassword2("P4ssw0rd#"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Check Password")
    public void falseCheckPassword(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.checkPassword2("Anna"), "Not a valid password");
    }

    //Erweiterung
    @Test
    @DisplayName("Valid: Number occurs three times check")
    public void occurThreeTimesTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.occurThree("password112211"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Number occurs three times check")
    public void occurMoreTimesTest(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.occurThree("1111"), "Not a valid password");
    }

    @Test
    @DisplayName("Valid: Ongoing Numbers check")
    public void twoOngoingNumbersTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.ongoingNumbers("p1s23"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Ongoing Numbers check")
    public void moreOngoingNumbersTest(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.ongoingNumbers("123"), "Not a valid password");
    }

    @Test
    @DisplayName("Valid: Check Password extension")
    public void checkPasswordTest(){
        ValidPassword pw = new ValidPassword();
        assertTrue(pw.checkPassword("P4ssw0rd#1112"), "Valid password");
    }
    @Test
    @DisplayName("Invalid: Check Password extension")
    public void falseCheckPasswordTest(){
        ValidPassword pw = new ValidPassword();
        assertFalse(pw.checkPassword("Anna123333"), "Not a valid password");
    }

}
package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataValidatorTest {
    @Test
    public void testValidatePhoneNumber() {
        String phoneNumber = "";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber1() {
        String phoneNumber = "08105795528";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber3() {
        String phoneNumber = "+2348105795528";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber4() {
        String phoneNumber = "+2347115795528";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber5() {
        String phoneNumber = "+23471OOOOOOO0";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertFalse(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber6() {
        String phoneNumber = "+234-8105795528";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }
    @Test
    public void testValidatePhoneNumber7() {
        String phoneNumber = "+234-810 5795 528";
        boolean isValidPhoneNumber = DataValidator.isPhoneNumberValid(phoneNumber);
        assertTrue(isValidPhoneNumber);
    }

    @Test
    public void testValidateEmailAddress(){
        String emailAddress = "";
        boolean isEmailNumberValid = DataValidator.isEmailNumberValid(emailAddress);
        assertFalse(isEmailNumberValid);
    }
    @Test
    public void testValidateEmailAddress1(){
        String emailAddress = "sulaimabaliqis@semicolon.africa";
        boolean isEmailNumberValid = DataValidator.isEmailNumberValid(emailAddress);
        assertTrue(isEmailNumberValid);
    }

    @Test
    public void testValidateEmailAddress2(){
        String emailAddress = "sulaimabaliqis@semicolon.africa";
        boolean isEmailNumberValid = DataValidator.isEmailNumberValid(emailAddress);
        assertTrue(isEmailNumberValid);
    }


}

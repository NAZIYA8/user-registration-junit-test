/**
 * ****************************************************************************
 * Purpose: This class contains the JUnit test cases i.e both positive and negative.
 * Positive test cases validates the entry successfully.
 * Negative test cases fails the entry. 
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 19-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.UserRegistration;


import static org.junit.Assert.*;
//import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import regex.UserRegistration;

public class UserRegistrationTest {
	UserRegistration user = null;

	@Before
	public void setUp() {
		user = new UserRegistration();
	}

	@Test
	public void validateFirstName_shouldReturnTrue_whenFirstLetterIsCapital() {
		boolean result = user.validateFirstName("Naziya");
		assertTrue(result);
	}

	@Test
	public void validateFirstName_shouldReturnFalse_whenFirstLetterIsNotCapital() {
		boolean result = user.validateFirstName("naziya");
		assertFalse(result);
	}

	@Test
	public void validateFirstName_shouldReturnTrue_whenFirstNameStartsWithCapitalAndHasMin3Char() {
		boolean result = user.validateFirstName("Naz");
		assertTrue(result);
	}

	@Test
	public void validateFirstName_shouldReturnFalse_whenFirstNameStartsWithCapitalAndHasLessThan3Char() {
		boolean result = user.validateFirstName("Na");
		assertFalse(result);
	}

	@Test
	public void validateLastName_shouldReturnTrue_whenFirstLetterIsCapital() {
		boolean result = user.validateLastName("Syeda");
		assertTrue(result);
	}

	@Test
	public void validateLastName_shouldReturnFalse_whenFirstLetterIsNotCapital() {
		boolean result = user.validateLastName("syeda");
		assertFalse(result);
	}

	@Test
	public void validateLastName_shouldReturnTrue_whenLastNameStartsWithCapitalAndHasMin3Char() {
		boolean result = user.validateLastName("Sye");
		assertTrue(result);
	}

	@Test
	public void validateLastName_shouldReturnFalse_whenLastNameStartsWithCapitalAndHasLessThan3Char() {
		boolean result = user.validateLastName("Sy");
		assertFalse(result);
	}

	@Test
	public void validatePhoneNumber_shouldReturnTrue_whenCountryCodeIsIncluded() {
		boolean result = user.validatePhoneNumber("91 9876543210");
		assertTrue(result);
	}

	@Test
	public void validatePhoneNumber_shouldReturnFalse_whenCountryCodeIsMissing() {
		boolean result = user.validatePhoneNumber("9876543210");
		assertFalse(result);
	}

	@Test
	public void validatePhoneNumber_shouldReturnFalse_whenSpaceIsNotFollowedByCountryCode() {
		boolean result = user.validatePhoneNumber("919876543210");
		assertFalse(result);
	}

	@Test
	public void validatePhoneNumber_shouldReturnFalse_whenNumberIsHavingLessDigits() {
		boolean result = user.validatePhoneNumber("91 9876");
		assertFalse(result);
	}

	@Test
	public void validateEmail_shouldReturnFalse_whenEmailIsMissingAnyOfValidMandatoryParts() {
		boolean result = user.validateEmail("@bl.co.in");
		assertFalse(result);
	}

	@Test
	public void validateEmail_shouldReturnFalse_whenEmailisMissingAtTheRateSymbol() {
		boolean result = user.validateEmail("abc.co.in");
		assertFalse(result);
	}

	@Test
	public void validateEmail_shouldReturnTrue_whenEmailHasAllMandatoryParts() {
		boolean result = user.validateEmail("abc.xyz@bl.co.in");
		assertTrue(result);
	}

	@Test
	public void validatePassword_shouldReturnFalse_whenPasswordIsHavingLessThan8Characters() {
		boolean result = user.validatePassword("J&4hd");
		assertFalse(result);
	}

	@Test
	public void validatePassword_shouldReturnTru_whenPasswordIsHavingAtleastOneUpperCase() {
		boolean result = user.validatePassword("Jac&9iwol");
		assertTrue(result);
	}

	@Test
	public void validatePassword_shouldReturnFalse_whenPasswordIsMissingNumeric() {
		boolean result = user.validatePassword("J&cksc%hd");
		assertFalse(result);
	}

	@Test
	public void validatePassword_shouldReturnTrue_whenPasswordIsHavingAtleastOneNumeric() {
		boolean result = user.validatePassword("J&cks6c%hd");
		assertTrue(result);
	}

	@Test
	public void validatePassword_shouldReturnFalse_whenPasswordIsMissingSpecialCharacter() {
		boolean result = user.validatePassword("Jsfiu74hd");
		assertFalse(result);
	}
	
	
	
	
}

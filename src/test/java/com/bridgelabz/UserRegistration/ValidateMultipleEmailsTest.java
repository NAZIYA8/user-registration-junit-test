/**
 * ****************************************************************************************
 * Purpose: This class contains the JUnit Parameterized test to validate multiple email id's
 			Parameterized test is used to execute the same test over and over again using
 			different values.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 19-06-2021
 * ****************************************************************************************
 */

package com.bridgelabz.UserRegistration;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.runners.Parameterized;
import org.junit.Test;
import regex.UserRegistration;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class ValidateMultipleEmailsTest {
	private String email;
	private boolean expectedresult;

	public ValidateMultipleEmailsTest(String email, boolean result) {
		this.email = email;
		this.expectedresult = expectedresult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}

	@Test
	public void enteredEmail_shouldBeReturnedAsParameterizedResult() {
		UserRegistration user = new UserRegistration();
		boolean result = user.validateMultipleEmail(this.email);
		assertEquals(this.expectedresult, result);

	}

}

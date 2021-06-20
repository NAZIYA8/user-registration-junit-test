/**
 * ****************************************************************************
 * Purpose: This class contains a number of methods. It helps the main method
 * to call these methods any number of times.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 19-06-2021
 * ****************************************************************************
 */
package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner scan = new Scanner(System.in);

	/**
	 * This method is used to take the first name as input and check if it is valid
	 * or not.
	 * 
	 * @param firstName is the firstName of user
	 */
	public boolean validateFirstName(String firstName) {

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher((firstName));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("First Name is Valid");
			return true;
		} else {
			System.out.println("First name is invalid");
			return false;
		}
	}

	/**
	 * This method is used to take the last name as input and check if it is valid
	 * or not.
	 * 
	 * @param lastName is the last name of user
	 */
	public boolean validateLastName(String lastName) {

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		Matcher matcher = pattern.matcher((lastName));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Last Name is Valid");
			return true;
		} else {
			System.out.println("Last name is invalid");
			return false;
		}
	}

	/**
	 * This method is used to take the Email id of user as input and check if it is
	 * valid or not.
	 * 
	 * @param email is the email id of the user
	 */
	public boolean validateEmail(String email) {

		Pattern pattern = Pattern
				.compile("^[a-zA-Z0-9]+([+.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		Matcher matcher = pattern.matcher((email));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Entered Email Id is Valid");
			return true;
		} else {
			System.out.println("Entered Email Id is Invalid");
			return false;
		}
	}

	/**
	 * This method is used to take the Phone number as input and checks if it is
	 * valid or not.
	 * 
	 * @param phoneNumber entered by user
	 */
	public boolean validatePhoneNumber(String phoneNumber) {

		Pattern pattern = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}");
		Matcher matcher = pattern.matcher((phoneNumber));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Entered Phone Number is Valid");
			return true;
		} else {
			System.out.println("Entered Phone Number is Invalid");
			return false;
		}
	}

	/**
	 * This method is used to take the Password as input and checks if it is valid
	 * or not. 
	 * Rule1: Minimum 8 characters. 
	 * Rule2: Should have at least 1 upper case.
	 * Rule3: Should have at least 1 numeric. 
	 * Rule4: Should have exactly 1 special character.
	 */
	public boolean validatePassword(String password) {

		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*?[!@#$%^&*?=-]).{8,}$");
		Matcher matcher = pattern.matcher((password));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Entered Password is Valid");
			return true;
		} else {
			System.out.println("Entered Password is Invalid");
			return false;
		}
	}

	/**
	 * This method is used to check for multiple email id's if valid or not
	 * 
	 * @param email is the email id of the user
	 */
	public boolean validateMultipleEmail(String email) {

		Pattern pattern = Pattern
				.compile("^[a-zA-Z0-9]+([+.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		Matcher matcher = pattern.matcher((email));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Entered Email Id is Valid");
			return true;
		} else {
			System.out.println("Entered Email Id is Invalid");
			return false;
		}
	}
}
/**
 * ****************************************************************************
 * Purpose: This class contains a number of methods. It helps the main method
 * 			to call these methods any number of times.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 21-06-2021
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
	public static boolean validateFirstName(String firstName) {

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		if (firstName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher((firstName));
		boolean check = matcher.matches();
		if (check) {
			return true;
		} else
			try {
				throw new ValidationException("Invalid First Name");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		return check;
	}

	/**
	 * This method is used to take the last name as input and check if it is valid
	 * or not.
	 * 
	 * @param lastName is the last name of user
	 */
	public static boolean validateLastName(String lastName) {

		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
		if (lastName == null) {
			return false;
		}
		Matcher matcher = pattern.matcher((lastName));
		boolean check = matcher.matches();
		if (check) {
			return true;
		} else
			try {
				throw new ValidationException("Invalid Last Name");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		return check;
	}

	/**
	 * This method is used to take the Email id of user as input and check if it is
	 * valid or not.
	 * 
	 * @param email is the email id of the user
	 */
	public static boolean validateEmail(String email) {

		Pattern pattern = Pattern
				.compile("^[a-zA-Z0-9]+([+.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
		if (email == null) {
			return false;
		}
		Matcher matcher = pattern.matcher((email));
		boolean check = matcher.matches();
		if (check) {
			return true;
		} else
			try {
				throw new ValidationException("Invalid Email Address");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		return check;
	}

	/**
	 * This method is used to take the Phone number as input and checks if it is
	 * valid or not.
	 * 
	 * @param phoneNumber entered by user
	 */
	public static boolean validatePhoneNumber(String phoneNumber) {

		Pattern pattern = Pattern.compile("^[0-9]{2}\\s{1}[0-9]{10}");
		if (phoneNumber == null) {
			return false;
		}
		Matcher matcher = pattern.matcher((phoneNumber));
		boolean check = matcher.matches();
		if (check) {
			return true;
		} else
			try {
				throw new ValidationException("Invalid Phone Number");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		return check;
	}

	/**
	 * This method is used to take the Password as input and checks if it is valid
	 * or not. Rule1: Minimum 8 characters. Rule2: Should have at least 1 upper
	 * case. Rule3: Should have at least 1 numeric. Rule4: Should have exactly 1
	 * special character.
	 */
	public static boolean validatePassword(String password) {

		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)(?=.*?[!@#$%^&*?=-]).{8,}$");
		if (password == null) {
			return false;
		}
		Matcher matcher = pattern.matcher((password));
		boolean check = matcher.matches();
		if (check) {
			System.out.println("Entered Password is Valid");
			return true;
		} else
			try {
				throw new ValidationException("Invalid Password");
			} catch (ValidationException e) {
				e.printStackTrace();
			}
		return check;
	}

	/**
	 * This is the main method where all the methods can be called.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Name : ");
		String firstName = scanner.next();
		System.out.println(validateFirstName(firstName));

		System.out.print("Enter Last Name : ");
		String lastName = scanner.next();
		System.out.println(validateLastName(lastName));

		System.out.print("Enter Email : ");
		String email = scanner.next();
		System.out.println(validateEmail(email));

		System.out.print("Enter Phone Number : ");
		String phoneNumber = scanner.next();
		System.out.println(validatePhoneNumber(phoneNumber));

		System.out.print("Enter Password : ");
		String password = scanner.next();
		System.out.println(validatePassword(password));
	}

}
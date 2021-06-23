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

/**
 * This annotation @FunctionalInterface is used to capture Compile Time Errors.
 */
@FunctionalInterface
interface NewUserValidationInterface {
	boolean validate(String input);
}

public class UserRegistration {

	NewUserValidationInterface validateFirstName = firstName -> firstName.matches("^[A-Z]{1}[a-z]{2,}");
	NewUserValidationInterface validateLastName = lastName -> lastName.matches("^[A-Z]{1}[a-z]{2,}");
	NewUserValidationInterface validateEmail = email -> email.matches("^[a-zA-Z0-9]+([+.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?");
	NewUserValidationInterface validatePhoneNumber = phoneNumber -> phoneNumber.matches("^[0-9]{2}\\s{1}[0-9]{10}");
	NewUserValidationInterface validatePassword = password -> password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*?[!@#$%^&*?=-]).{8,}$");

	/**
	 * This method is used to take the first name as input and check if it is valid
	 * or not.
	 * 
	 * @param firstName is the firstName of user
	 * @return True if valid First name
	 * @throws ValidationException
	 */
	public boolean validateFirstName(String firstName) throws ValidationException {

		if (validateFirstName.validate(firstName)) {
			return true;
		} else
			throw new ValidationException("Invalid First Name");
	}

	/**
	 * This method is used to take the last name as input and check if it is valid
	 * or not.
	 * 
	 * @param lastName is the last name of user
	 * @return True if valid Last name
	 * @throws ValidationException
	 */
	public boolean validateLastName(String lastName) throws ValidationException {

		if (validateLastName.validate(lastName)) {
			return true;
		} else
			throw new ValidationException("Invalid Last Name");
	}

	/**
	 * This method is used to take the Email id of user as input and check if it is
	 * valid or not.
	 * 
	 * @param email is the email id of the user
	 * @return True if valid email id
	 * @throws ValidationException
	 */
	public boolean validateEmail(String email) throws ValidationException {
		if (validateEmail.validate(email)) {
			return true;
		} else
			throw new ValidationException("Invalid Email");
	}

	/**
	 * This method is used to take the Phone number as input and checks if it is
	 * valid or not.
	 * 
	 * @param phoneNumber entered by user
	 * @return True if valid phoneNumber
	 * @throws ValidationException
	 */
	public boolean validatePhoneNumber(String phoneNumber) throws ValidationException {
		if (validatePhoneNumber.validate(phoneNumber)) {
			return true;
		} else
			throw new ValidationException("Invalid PhoneNumber");
	}

	/**
	 * This method is used to take the Password as input and checks if it is valid
	 * or not. Rule1: Minimum 8 characters. Rule2: Should have at least 1 upper
	 * case. Rule3: Should have at least 1 numeric. Rule4: Should have exactly 1
	 * special character.
	 * 
	 * @param password entered by user
	 * @return True if valid password
	 * @throws ValidationException
	 */
	public boolean validatePassword(String password) throws ValidationException {

		if (validatePassword.validate(password)) {
			return true;
		} else
			throw new ValidationException("Invalid Password");
	}

	/**
	 * This is the main method where all the methods can be called.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UserRegistration user = new UserRegistration();
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First Name : ");
		String firstName = scanner.nextLine();
		try {
			if (user.validateFirstName(firstName))
				System.out.println("Valid First Name");
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		System.out.print("Enter Last Name : ");
		String lastName = scanner.nextLine();
		try {
			if (user.validateLastName(lastName))
				System.out.println("Valid Last Name");
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		System.out.print("Enter Email : ");
		String email = scanner.nextLine();
		try {
			if (user.validateEmail(email))
				System.out.println("Valid email");
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		System.out.print("Enter Phone Number : ");
		String phoneNumber = scanner.next();
		try {
			if (user.validatePhoneNumber(phoneNumber))
				System.out.println("Valid Phone Number");
		} catch (ValidationException e) {
			e.printStackTrace();
		}

		System.out.print("Enter Password : ");
		String password = scanner.next();
		try {
			if (user.validatePassword(password))
				System.out.println("Valid Password");
		} catch (ValidationException e) {
			e.printStackTrace();
		}
	}

}
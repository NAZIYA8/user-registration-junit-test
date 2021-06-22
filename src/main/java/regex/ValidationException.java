/**
 * ****************************************************************************
 * Purpose: This is Validation Exception class extends 
 * 			the RunTimeException.
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 21-06-2021
 * ****************************************************************************
 */

package regex;

public class ValidationException extends RuntimeException {

	public ValidationException(String message) {
		super(message);
	}

}

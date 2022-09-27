package com.bridglabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {

	/*
	 * method to check first name
	 */
	public boolean firstName(String firstName) {

		String regex="^([A-Z]{1}[a-z]{2,}";
		Pattern pattern=Pattern.compile(regex);
		Matcher match=pattern.matcher(firstName);

		return match.matches();

	}

	/*
	 * method to chek last name 
	 */

	public boolean lastName(String lastName) {
		String regex = "^([A-Z]{1}[a-z]{2,})";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
}


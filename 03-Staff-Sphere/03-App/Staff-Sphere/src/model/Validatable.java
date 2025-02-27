//=====================================================================
// File Name: Validatable.java
// Subject  : Interface that validate some data stored in an object.
// Date     : Feb 27, 2025
// Author   : Alsayed A. Khaleel
//=====================================================================

package model;

public interface Validatable
{
	// validate the manager password format.
	static boolean isPasswordValid(String password) {
		return password.matches("^((\\w|\\d|[@#$%^&*-_+=!><~`!]){8,20}){1,2}$");
	}

	// validate the name.
	static boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,10}");
	}

	// validate the address.
	static boolean isAddressValid(String address) {
		return address.matches("[1-9]\\d{1,}\\s*([a-zA-Z]{2,10}\\s*)+");
	}

	// prefix: 010, 011, 012, 015
	// phone number has a prefix and 11 characters length.
	static boolean isPhoneNumberValid(String phone){
		return phone.matches("^(01)[0125]-\\d{4}-\\d{4}$");
	}
}



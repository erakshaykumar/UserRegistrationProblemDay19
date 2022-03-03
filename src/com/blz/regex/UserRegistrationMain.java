/*@Purpose : As a User need to enter a valid First Name
 *  First name starts with Cap and has minimum 3 characters
 *@File : User Registration Using Regex
 *@Author : Akshay Kumar
 */

package com.blz.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	static Scanner scanner = new Scanner(System.in);

	public static void welcome() {
		System.out.println("Welcome to User Registation Program");
	}

	/*
	 * @Purpose : Taking Proper Values From User
	 */
	public static void main(String[] args) {
		welcome();
		System.out.println("Enter 1 : to validate First Name ");
		switch (scanner.nextInt()) {
		case 1:
			UserRegistration.validFirstName();
			break;
		}
	}
}

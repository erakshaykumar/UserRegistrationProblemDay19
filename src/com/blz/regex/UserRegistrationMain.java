/*@Purpose :As a User need to follow pre defined Password Rules
 *Rule4 – Has exactly Special Character - NOTE – All rules must be passed
 *@File : User Registration Using Regex
 *@Author : Akshay Kumar
 */

package com.blz.regex;

import java.util.Scanner;

public class UserRegistrationMain {
	static Scanner scanner = new Scanner(System.in);

	/*
	 * @Purpose : Taking Proper Values From User
	 */
	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 0 : Exit");
			System.out.println("Enter 1 : To validate First Name ");
			System.out.println("Enter 2 : To validate Last Name ");
			System.out.println("Enter 3 : To validate E-mail ");
			System.out.println("Enter 4 : To validate Moblie Number ");
			System.out.println("Enter 5 : To validate Password Rule 1 ");
			System.out.println("Enter 6 : To validate Password Rule 2 (Upper Case) ");
			System.out.println("Enter 7 : To validate Password Rule 3 (Upper Case & One Numeric Number)");
			System.out.println(
					"Enter 8 : To validate Password Rule 4 (Upper Case & One Numeric Number & One Special Character)");

			switch (scanner.nextInt()) {
			case 0:
				System.exit(0);

			case 1:
				UserRegistration.validFirstName();
				break;

			case 2:
				UserRegistration.validLastName();
				break;

			case 3:
				UserRegistration.validEmail();
				break;

			case 4:
				UserRegistration.validMobileNumber();
				break;

			case 5:
				UserRegistration.validPassRule1();
				break;

			case 6:
				UserRegistration.validPassRule2();
				break;

			case 7:
				UserRegistration.validPassRule3();
				break;

			case 8:
				UserRegistration.validPassRule4();
				break;

			default:
				System.out.println("Select a valid number");
			}
		}
	}
}

/*@Purpose : As a User need to enter a valid First,Last Name And Email
 *  First name starts with Cap and has minimum 3 characters And Email
 *  E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
 *  & co) and 2 optional (xyz & in) with precise @ and . positions
 *@File : User Registration Using Regex
 *@Author : Akshay Kumar
 */

package com.blz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	static Scanner scanner = new Scanner(System.in);

	/*
	 * @Purpose : Take First Name And Check It Is Getting Matched With Regex/Regular
	 * Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validFirstName() {

		System.out.println("Enter First Name:");
		String name = scanner.next();
		String regex = "^[A-Z]{1}[a-z]*";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		boolean r = m.matches();

		if (r)
			System.out.println("It Is A Valid First Name");
		else
			System.out.println("It Is Invalid First Name");

	}

	/*
	 * @Purpose : Take Last Name And Check It Is Getting Matched With Regex/Regular
	 * Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validLastName() {

		System.out.println("Enter Last Name:");
		String lname = scanner.next();
		String regex = "^[A-Z]{1}[a-z]{2,}$";

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		boolean r = m.matches();

		if (r)
			System.out.println("It Is A Last Name");
		else
			System.out.println("It Is Invalid Last name");

	}

	/*
	 * @Purpose : Take E-Mail Id And Check It Is Getting Matched With Regex/Regular
	 * Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validEmail() {

		System.out.println("Enter E-mail:");
		String email = scanner.next();

		String regex = "^[a-zA-Z0-9]+([.][A-Za-z]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([.][A-Za-z]+)*$";
		;

		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean r = m.matches();

		if (r)
			System.out.println("Valid Email Address");
		else
			System.out.println("Email Address is Invalid");

	}
}
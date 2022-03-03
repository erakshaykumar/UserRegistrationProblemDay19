/*@Purpose :As a User need to follow pre defined Password Rules
 *Should clear all Email samples provided separately
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
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		boolean r = m.matches();

		if (r)
			System.out.println("Valid Email Address");
		else
			System.out.println("Email Address is Invalid");

	}

	/*
	 * @Purpose : Take Mobile Number And Check It Is Getting Matched With
	 * Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validMobileNumber() {

		System.out.print("Enter your Mobile Number : ");
		String phoneNo = scanner.nextLine();
		String regex3 = "(91|0)?\\s?[6-9][0-9]{9}$";
		Pattern p3 = Pattern.compile(regex3);
		Matcher m3 = p3.matcher(phoneNo);
		boolean r3 = m3.matches();
		if (r3)
			System.out.println("Phone Number is Valid");
		else
			System.out.println("Phone Number is Invalid");
	}

	/*
	 * @Purpose : Take Password Atleast 8 Character And Check It Is Getting Matched
	 * With Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validPassRule1() {
		System.out.print("Enter The Password Atleast Eight Character : ");
		String passWord = scanner.nextLine();
		String regex4 = "^[A-Z a-z 0-9]{8,}$";
		Pattern p4 = Pattern.compile(regex4);
		Matcher m4 = p4.matcher(passWord);
		boolean r4 = m4.matches();
		if (r4)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}

	/*
	 * @Purpose : Take Password Atleat 1 Numeric Number In Password And Also Check
	 * It Is Getting Matched With Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validPassRule2() {
		System.out.print("Enter the Password Atleast One Upper Case & Eight Character :");
		String passWord1 = scanner.nextLine();
		String regex5 = "^[A-Z]{1}+[a-zA-z0-9]{7,}$";
		Pattern p5 = Pattern.compile(regex5);
		Matcher m5 = p5.matcher(passWord1);
		boolean r5 = m5.matches();
		if (r5)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}

	/*
	 * @Purpose : Take Password Atleast One Upper Case Character,Numeric & Eight
	 * Character And Also Check It Is Getting Matched With Regex/Regular Expression
	 * Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validPassRule3() {
		System.out.println("Enter the Password Atleast One Upper Case & One Numaric");
		String passWord2 = scanner.nextLine();
		String regex6 = "^[A-Z]{1}+[a-zA-Z]{6}+[0-9]+{1,}$";
		Pattern p6 = Pattern.compile(regex6);
		Matcher m6 = p6.matcher(passWord2);
		boolean r6 = m6.matches();
		if (r6)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}

	/*
	 * @Purpose : Take Password Atleast One Upper Case Character,Numeric,Special
	 * Character & Eight Character And Also Check It Is Getting Matched With
	 * Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void validPassRule4() {
		System.out.print("Enter the Password Atleast One Upper Case & One Numaric & One Special Character:  ");
		String passWord2 = scanner.next();
		String regex6 = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*?&]{5,}$";
		Pattern p6 = Pattern.compile(regex6);
		Matcher m6 = p6.matcher(passWord2);
		boolean r6 = m6.matches();
		if (r6)
			System.out.println("Password is Valid");
		else
			System.out.println("Password is Invalid");
	}

	/*
	 * @Purpose : Take Password Atleast One Upper Case Character,Numeric,Special
	 * Character & Gmail Address & Eight Character And Also Check It Is Getting
	 * Matched With Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void emailSamples() {
		System.out.print("Enter the email : @gmail.com ");
		String emailSample = scanner.next();
		String regex6 = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
		Pattern p6 = Pattern.compile(regex6);
		Matcher m6 = p6.matcher(emailSample);
		boolean r6 = m6.matches();
		if (r6)
			System.out.println("Valid G-mail Address");
		else
			System.out.println("Invalid G-mail Address");
	}
}
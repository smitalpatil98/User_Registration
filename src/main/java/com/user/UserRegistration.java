package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public void validateNumber()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Mobile Number");
    String MobileNumber = sc.nextLine();
    String regex = "^[0-9]{2} [0-9]{10}$";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(MobileNumber);
    boolean b = m.matches();
    System.out.println(b);
    }
    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validateNumber();
    }
}
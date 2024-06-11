package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public void validatePassword()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter password");
    String password = sc.nextLine();
    String regex = "^([a-z]{8,})$";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(password);
    boolean b = m.matches();
    System.out.println(b);
    }
    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validatePassword();
    }
}
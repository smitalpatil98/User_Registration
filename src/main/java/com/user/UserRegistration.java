package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public void validateName()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter last name");
    String lastName = sc.nextLine();
    String regex = "[A-Z][a-z]{4,10}";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(lastName);
    boolean b = m.matches();
    System.out.println(b);
    }
    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validateName();
    }
}
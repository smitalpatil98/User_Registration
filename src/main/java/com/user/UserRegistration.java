package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public void validateName()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Email Id");
    String emailid = sc.nextLine();
    String regex=  "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(emailid);
    boolean b = m.matches();
    System.out.println(b);
    }
    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validateName();
    }
}
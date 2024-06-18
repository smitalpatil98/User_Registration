
package com.user;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserRegistration
{
    public void validateUppercase()
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Should have at least numeric number in password");
    String Uppercase = sc.nextLine();
    String regex =  "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(Uppercase);
    boolean b = m.matches();
    System.out.println(b);
    }
    public static void main(String[] args)
    {
        UserRegistration ur = new UserRegistration();
        ur.validateUppercase();
    }
}